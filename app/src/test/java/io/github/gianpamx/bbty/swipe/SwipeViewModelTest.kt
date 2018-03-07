package io.github.gianpamx.bbty.swipe

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class SwipeViewModelTest {
    @Rule
    @JvmField
    val instantExecutor = InstantTaskExecutorRule()

    lateinit var swipeViewModel: SwipeViewModel

    @Before
    fun setUp() {
        swipeViewModel = SwipeViewModel()
    }

    @Test
    fun empty() {
    }
}
