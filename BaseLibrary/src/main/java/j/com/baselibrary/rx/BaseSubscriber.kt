package j.com.baselibrary.rx

import j.com.baselibrary.presenter.view.BaseView
import rx.Subscriber

/**
 * desc:  <br/>
 * time:2018/8/6<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
open class BaseSubscriber<T>(val baseView:BaseView):Subscriber<T>() {
    override fun onCompleted() {
        baseView.hideLoading()
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable?) {
        baseView.hideLoading()
        if (e is BaseException){
            baseView.onError(e.msg)
        }
    }
}