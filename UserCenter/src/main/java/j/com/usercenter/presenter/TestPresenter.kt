package j.com.usercenter.presenter

import j.com.baselibrary.ext.execute
import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.rx.BaseSubscriber
import j.com.usercenter.data.TestBean
import j.com.usercenter.presenter.view.RegisterView
import j.com.usercenter.presenter.view.TestView
import j.com.usercenter.service.impl.TestServiceImpl
import j.com.usercenter.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by zhoufeng on 2018/8/6.
 */
class TestPresenter : BasePresenter<TestView>(){

    fun test(){
        val userService = TestServiceImpl()
        userService.test()
                .execute(object :BaseSubscriber<TestBean>(){
                    override fun onNext(t: TestBean) {
                        mView.onGetResult(t)
                    }
                })

    }

}