package j.com.baselibrary.rx

import rx.Subscriber

/**
 * desc:  <br/>
 * time:2018/8/6<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
open class BaseSubscriber<T>:Subscriber<T>() {
    override fun onCompleted() {

    }

    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {

    }
}