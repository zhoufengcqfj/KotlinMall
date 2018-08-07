package j.com.usercenter.data.repository

import j.com.baselibrary.data.net.RetrofitFactory
import j.com.baselibrary.data.protocol.BaseResp
import j.com.usercenter.data.TestBean
import j.com.usercenter.data.api.UserApi
import j.com.usercenter.data.protocol.RegisterReq
import rx.Observable

/**
 * desc:  <br/>
 * time:2018/8/7<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
class TestRepository {
    fun  test(): Observable<TestBean> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .test()
    }
}