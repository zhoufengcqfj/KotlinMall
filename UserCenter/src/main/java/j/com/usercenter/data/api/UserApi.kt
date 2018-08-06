package j.com.usercenter.data.api

import j.com.baselibrary.data.protocol.BaseResp
import j.com.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * desc:  <br/>
 * time:2018/8/6<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
interface UserApi {
    /*
     *  用户注册
     */
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq):Observable<BaseResp<String>>
}