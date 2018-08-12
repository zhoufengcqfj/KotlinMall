package j.com.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import j.com.baselibrary.injection.ActivityScope
import j.com.baselibrary.injection.module.ActivityModule
import j.com.baselibrary.injection.module.LifecycleProviderModule

/*
    Activity级别Component
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class, LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity(): Activity

    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}
