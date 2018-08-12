package j.com.baselibrary.presenter

import android.content.Context
import com.kotlin.base.utils.NetWorkUtils
import com.trello.rxlifecycle.LifecycleProvider
import j.com.baselibrary.common.BaseApplication.Companion.context
import j.com.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by zhoufeng on 2018/8/6.
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView : T

    //Dagger注入，Rx生命周期管理
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    @Inject
    lateinit var context: Context

    /*
       检查网络是否可用
    */
    fun checkNetWork():Boolean{
        if(NetWorkUtils.isNetWorkAvailable(context)){
            return true
        }
        mView.onError("网络不可用")
        return false
    }
}