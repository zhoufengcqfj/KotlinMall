package j.com.baselibrary.ext

import j.com.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * desc:  <br/>
 * time:2018/8/6<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
fun <T> Observable<T>.execute(subscriber:BaseSubscriber<T>){
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}