package io.github.gianpamx.bbty.swipe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import io.github.gianpamx.bbty.R
import javax.inject.Inject

class SwipeActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: SwipeViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)

        setContentView(R.layout.swipe_activity)
    }
}
