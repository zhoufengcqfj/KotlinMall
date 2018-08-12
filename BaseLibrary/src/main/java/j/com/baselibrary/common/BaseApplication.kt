package j.com.baselibrary.common

import android.app.Application
import android.content.Context
import j.com.baselibrary.injection.component.AppComponent
import j.com.baselibrary.injection.component.DaggerAppComponent
import j.com.baselibrary.injection.module.AppModule

/**
 * desc:  <br/>
 * time:2018/8/12<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
class BaseApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppInjection()
        context = this
    }

    /*
     Application Component初始化
  */
    private fun initAppInjection() {
//        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    /*
       全局伴生对象
    */
    companion object {
        lateinit var context: Context
    }
}