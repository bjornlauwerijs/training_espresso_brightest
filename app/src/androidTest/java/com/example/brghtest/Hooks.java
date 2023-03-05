package com.example.brghtest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.brghtest.Screens.CalculatorScreen;
import com.example.brghtest.Screens.LoginScreen;
import com.example.brghtest.Screens.MenuScreen;
import com.example.brghtest.Screens.WhatDoYouMemeScreen;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class Hooks {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule(MainActivity.class);
    private MainActivity mainActivity;

    @Before
    public void setUpBeforeClass() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");
    }

    @Test
    public void OpenMenu() {
        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());
    }

    @Test
    public void ScrollWhatDoYouMeme() {
        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenWhatDoYouMeme();

        WhatDoYouMemeScreen whatDoYouMeme = new WhatDoYouMemeScreen();
        whatDoYouMeme.ScrollDown();
        whatDoYouMeme.ScrollUp();
    }
}
