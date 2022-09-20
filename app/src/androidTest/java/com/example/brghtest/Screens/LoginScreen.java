package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

//Dit is de POM voor het loginscherm
public class LoginScreen {
    //id kan je ophalen in activity_main.xml of via de layoutinspector
    ViewInteraction emailtextField = onView(withId(R.id.usernameTextField));
    ViewInteraction passwordtextField = onView(withId(R.id.passwordTextField));
    ViewInteraction loginButton = onView(withId(R.id.loginButton));

    public void login(String username, String password){

        emailtextField.perform(typeText(username));
        passwordtextField.perform(typeText(password));
        loginButton.perform(click());
    }
}