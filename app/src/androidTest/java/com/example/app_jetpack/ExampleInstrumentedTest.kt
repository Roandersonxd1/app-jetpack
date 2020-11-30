package com.example.app_jetpack

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val rule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun startFragment_to_profileFragment() {
        onView(withId(R.id.buttonNext)).perform(click())
        onView(withId(R.id.txtprofile)).check(matches(isDisplayed()))
    }
}
