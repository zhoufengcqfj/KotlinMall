package j.com.baselibrary.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import j.com.baselibrary.injection.ActivityScope

/*
    Activity级别Module
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}
