package j.com.usercenter.service

import j.com.usercenter.data.TestBean
import rx.Observable

/**
 * Created by zhoufeng on 2018/8/6.
 */
interface TestService {
    fun test(): Observable<TestBean>
}