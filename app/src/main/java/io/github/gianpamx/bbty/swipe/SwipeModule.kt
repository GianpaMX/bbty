package io.github.gianpamx.bbty.swipe

import android.arch.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides

@Module
class SwipeModule {
    @Provides
    fun provideGalleryViewModelFactory() =
            SwipeViewModel.Factory()

    @Provides
    fun provideFormViewModel(activity: SwipeActivity, factory: SwipeViewModel.Factory) =
            ViewModelProviders.of(activity, factory).get(SwipeViewModel::class.java)
}
