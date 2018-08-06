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

/**
 * Created by zhoufeng on 2018/8/6.
 */
class RegisterPresenter:BasePresenter<RegisterView>(){
    fun register(mobile:String,verifyCode:String,pwd:String){
        val userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
}
