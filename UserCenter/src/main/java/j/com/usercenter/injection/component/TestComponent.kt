package j.com.usercenter.injection.component

import dagger.Component
import j.com.baselibrary.injection.TestComponentScope
import j.com.baselibrary.injection.component.ActivityComponent
import j.com.usercenter.injection.module.TestModule
import j.com.usercenter.ui.activity.TestActivity

/**
 * desc:  <br/>
 * time:2018/8/12<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
@TestComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(TestModule::class))
interface TestComponent {
    fun inject(activity:TestActivity)
}