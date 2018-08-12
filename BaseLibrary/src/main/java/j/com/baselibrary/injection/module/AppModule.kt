package j.com.baselibrary.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import j.com.baselibrary.common.BaseApplication
import javax.inject.Singleton

/*
    Application级别Module
 */
@Module
class AppModule(private val context: BaseApplication) {

    @Singleton
    @Provides
    fun provideContext(): Context {

        return this.context
    }
}
