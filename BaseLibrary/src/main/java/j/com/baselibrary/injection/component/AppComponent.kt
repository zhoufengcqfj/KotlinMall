package j.com.baselibrary.injection.component

import android.content.Context
import dagger.Component
import j.com.baselibrary.injection.module.AppModule
import javax.inject.Singleton


/*
    Application级别Component
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun context(): Context
}
