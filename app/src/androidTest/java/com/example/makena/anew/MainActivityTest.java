package com.example.makena.anew;

/**
 * Created by makena on 22/05/17.
 */

import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.intent.Intents.intended;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

@Rule
public ActivityTestRule<MainActivity> mActivity = new ActivityTestRule<> (MainActivity.class);
//    public IntentsTestRule<MainActivity> msct = new IntentsTestRule<>(MainActivity.class);
    public IntentsTestRule<MainActivity> mActivityRule = new IntentsTestRule<>(MainActivity.class);

    @Test

    public void ensureRegisterIntentLaunchesonRegisterButtonClick(){
        Intents.init();
        //Checks that the btn_one does not have a null value
        onView(withId(R.id.btn_register)).check(matches(notNullValue() ));
        //Check that btn_one matches ONE
        onView(withId(R.id.btn_register)).check(matches(withText("Register")));
        //Click btn_one
        onView(withId(R.id.btn_register)).perform(click());

        intended(hasComponent("com.example.makena.anew.RegisterActivity"));
    }



}
