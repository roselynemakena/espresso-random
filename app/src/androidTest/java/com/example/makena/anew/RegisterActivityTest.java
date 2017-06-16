package com.example.makena.anew;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by makena on 22/05/17.
 */
@RunWith(AndroidJUnit4.class)

public class RegisterActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> regActivity = new ActivityTestRule<>(RegisterActivity.class);

    @Test
    public void checkRegisterIntent() {
        //Checks that the btn_one does not have a null value
        onView(withId(R.id.save)).check(matches(notNullValue()));

        onView(withId(R.id.save)).check(matches(withText("Save")));

    }
}
