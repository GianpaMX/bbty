package io.github.gianpamx.bbty.app

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TestApp : Application(), HasActivityInjector {
    @Inject
    lateinit var injector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerTestAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    override fun activityInjector() = injector
}
