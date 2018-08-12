package j.com.usercenter.presenter

import j.com.baselibrary.ext.execute
import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.rx.BaseSubscriber
import j.com.usercenter.presenter.view.RegisterView
import j.com.usercenter.service.UserService
import j.com.usercenter.service.impl.UserServiceImpl
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by zhoufeng on 2018/8/6.
 */
class RegisterPresenter @Inject constructor() :BasePresenter<RegisterView>(){
    fun register(mobile:String,verifyCode:String,pwd:String){
        val userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
        mView.showLoading()

//        userService.register(mobile, pwd, verifyCode).excute(object : BaseSubscriber<Boolean>(mView) {
//            override fun onNext(t: Boolean) {
//                if (t)
//                    mView.onRegisterResult("注册成功")
//            }
//        }, lifecycleProvider)
    }
}
