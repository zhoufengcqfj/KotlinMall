package j.com.usercenter.service.impl


import j.com.baselibrary.data.protocol.BaseResp
import j.com.baselibrary.ext.convertBoolean
import j.com.baselibrary.rx.BaseException
import j.com.baselibrary.rx.BaseFuncBoolean
import j.com.usercenter.data.repository.UserRepository
import j.com.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 * Created by zhoufeng on 2018/8/6.
 */
class UserServiceImpl:UserService{
    override fun register(mobile: String, verifycode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
         return repository.register(mobile,pwd,verifycode)
                 .convertBoolean()
    }
}
