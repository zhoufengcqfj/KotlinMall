package j.com.baselibrary.injection

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * desc:  <br/>
 * time:2018/8/12<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */


@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class TestComponentScope
