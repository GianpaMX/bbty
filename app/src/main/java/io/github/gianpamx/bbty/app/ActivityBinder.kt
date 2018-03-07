package io.github.gianpamx.bbty.app

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.gianpamx.bbty.swipe.SwipeActivity
import io.github.gianpamx.bbty.swipe.SwipeModule


@Module
abstract class ActivityBinder {
    @ContributesAndroidInjector(modules = [SwipeModule::class])
    abstract fun bindFormActivity(): SwipeActivity
}
