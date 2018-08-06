package j.com.usercenter.service

import rx.Observable


/**
 * Created by zhoufeng on 2018/8/6.
 */
interface UserService{
    fun register(mobile:String,verifycode:String,pwd:String): Observable<Boolean>
}