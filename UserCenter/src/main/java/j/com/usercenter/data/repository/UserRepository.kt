package j.com.usercenter.data.repository

import j.com.baselibrary.data.net.RetrofitFactory
import j.com.baselibrary.data.protocol.BaseResp
import j.com.usercenter.data.api.UserApi
import j.com.usercenter.data.protocol.RegisterReq
import rx.Observable

/**
 * desc:  <br/>
 * time:2018/8/7<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
class UserRepository {
    fun  register(mobile:String,verifycode:String,pwd:String): Observable<BaseResp<String>>{
       return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile,pwd,verifycode))
    }
}