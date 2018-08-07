package j.com.usercenter.service.impl

import j.com.baselibrary.data.protocol.BaseResp
import j.com.baselibrary.rx.BaseException
import j.com.usercenter.data.TestBean
import j.com.usercenter.data.repository.TestRepository
import j.com.usercenter.data.repository.UserRepository
import j.com.usercenter.service.TestService
import j.com.usercenter.service.UserService
import rx.Observable
import rx.functions.Action
import rx.functions.Action1
import rx.functions.Func1

/**
 * Created by zhoufeng on 2018/8/6.
 */
class TestServiceImpl : TestService {
    override fun test(): Observable<TestBean> {
        val repository = TestRepository()
         return repository.test()

//                 .flatMap(object :Func1<TestBean,
//                         Observable<TestBean>>{
//                     override fun call(t: TestBean): Observable<TestBean> {
////                         if (t.errorCode!=0){
////                             return Observable.error("errorvcx,lvc,vc,lvcl")
////                         }
//                         return Observable.just(t)
//                     }
//                 })
    }
}