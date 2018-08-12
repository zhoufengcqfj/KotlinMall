package j.com.usercenter.ui.fragment

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import j.com.baselibrary.common.BaseApplication
import j.com.baselibrary.injection.component.ActivityComponent
import j.com.baselibrary.injection.component.DaggerActivityComponent
import j.com.baselibrary.injection.module.ActivityModule
import j.com.baselibrary.injection.module.LifecycleProviderModule
import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.presenter.view.BaseView
import org.jetbrains.anko.support.v4.toast
import javax.inject.Inject


/*
    Fragment基类，业务相关
 */
abstract open class BaseMvpFragment<T : BasePresenter<*>>() : BaseFragment(), BaseView, Parcelable {

    @Inject
    lateinit var mPresenter: T

    lateinit var mActivityComponent: ActivityComponent

//    private lateinit var mLoadingDialog:ProgressLoading

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        initActivityInjection()
        injectComponent()

        //初始加载框
//        mLoadingDialog = ProgressLoading.create(context)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    /*
        Dagger注册
     */
    protected abstract fun injectComponent()

    /*
        初始化Activity级别Component
     */
    private fun initActivityInjection() {
        mActivityComponent = DaggerActivityComponent.builder().appComponent((activity.application as BaseApplication).appComponent)
                .activityModule(ActivityModule(activity))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

    /*
       显示加载框，默认实现
    */
    override fun showLoading() {
//        mLoadingDialog.showLoading()
    }

    /*
        隐藏加载框，默认实现
     */
    override fun hideLoading() {
//        mLoadingDialog.hideLoading()
    }

    /*
        错误信息提示，默认实现
     */
    override fun onError(text:String) {
        toast(text)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

//    companion object CREATOR : Parcelable.Creator<BaseMvpFragment> {
//        override fun createFromParcel(parcel: Parcel): BaseMvpFragment {
//            return BaseMvpFragment(parcel)
//        }
//
//        override fun newArray(size: Int): Array<BaseMvpFragment?> {
//            return arrayOfNulls(size)
//        }
//    }
}