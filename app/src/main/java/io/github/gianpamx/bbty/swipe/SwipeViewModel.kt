package io.github.gianpamx.bbty.swipe

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class SwipeViewModel : ViewModel() {
    class Factory : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>) = SwipeViewModel() as T
    }
}
