package course.simpleapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun addedViewEnabledOnClick() {
        onView(withId(R.id.editTextTextPersonName))
            .perform(click())
            .check(matches(isEnabled()))
    }

    @Test
    fun addedViewFocusedOnClick() {
        onView(withId(R.id.editTextTextPersonName))
            .perform(click())
            .check(matches(isFocused()))
    }
}
