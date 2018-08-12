package j.com.usercenter.injection.module

import dagger.Module
import dagger.Provides
import j.com.usercenter.service.TestService
import j.com.usercenter.service.impl.TestServiceImpl

/**
 * desc:  <br/>
 * time:2018/8/12<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
@Module
class TestModule {

    @Provides
    fun provideTestService(userService: TestServiceImpl): TestService {
        return userService
    }

}