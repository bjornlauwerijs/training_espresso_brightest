package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

// Page Object Model for "Login" screen
public class LoginScreen {

    // You can find id by using layout inspector while running the app

    ViewInteraction emailtextField = onView(withId(R.id.usernameTextField));
    ViewInteraction passwordtextField = onView(withId(R.id.passwordTextField));
    ViewInteraction loginButton = onView(withId(R.id.loginButton));

    public void login(String username, String password){

        emailtextField.perform(typeText(username)).perform(closeSoftKeyboard());
        passwordtextField.perform(typeText(password)).perform(closeSoftKeyboard());
        loginButton.perform(click());
    }
}
