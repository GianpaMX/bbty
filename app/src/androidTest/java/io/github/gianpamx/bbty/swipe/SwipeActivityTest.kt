package io.github.gianpamx.bbty.swipe


import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SwipeActivityTest {
    @Rule
    @JvmField
    var testRule = ActivityTestRule(SwipeActivity::class.java)

    @Test
    fun empty() {
    }
}
