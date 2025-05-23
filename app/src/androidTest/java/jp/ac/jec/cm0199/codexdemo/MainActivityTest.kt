package jp.ac.jec.cm0199.codexdemo

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun helloWorldIsDisplayed() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
