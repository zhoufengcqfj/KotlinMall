package j.com.baselibrary.ui.activity

import android.os.Bundle
import j.com.baselibrary.common.BaseApplication
import j.com.baselibrary.injection.component.ActivityComponent
import j.com.baselibrary.injection.component.DaggerActivityComponent
import j.com.baselibrary.injection.module.ActivityModule
import j.com.baselibrary.injection.module.LifecycleProviderModule
import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.presenter.view.BaseView
import j.com.baselibrary.widgets.ProgressLoading
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by zhoufeng on 2018/8/6.
 */
 abstract open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView{

    lateinit var mActivityComponent: ActivityComponent

    @Inject
    lateinit var mPresenter:T

    private lateinit var mLoadingDialog:ProgressLoading

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()

        //初始加载框
        mLoadingDialog = ProgressLoading.create(this)
    }

    /*
       初始Activity Component
    */
    private fun initActivityInjection() {

        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }

    /*
    Dagger注册
 */
    protected abstract fun injectComponent()

    /*
     显示加载框，默认实现
  */
    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    /*
        隐藏加载框，默认实现
     */
    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    /*
        错误信息提示，默认实现
     */
    override fun onError(text:String) {
        toast(text)
    }
}