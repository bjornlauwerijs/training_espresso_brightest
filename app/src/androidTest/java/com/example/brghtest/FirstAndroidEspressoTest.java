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

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(AndroidJUnit4.class)
public class FirstAndroidEspressoTest {


    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule(MainActivity.class);
    private MainActivity mainActivity;

    // Assignment 1 - Login
    @Test
    public void loginTest() {
        // id kan je ophalen in activity_main.xml
        ViewInteraction emailtextField = onView(withId(R.id.usernameTextField));
        emailtextField.perform(typeText("admin")).perform(closeSoftKeyboard());

        ViewInteraction passwordtextField = onView(withId(R.id.passwordTextField));
        passwordtextField.perform(typeText("admin")).perform(closeSoftKeyboard());

        ViewInteraction loginButton = onView(withId(R.id.loginButton));
        loginButton.perform(click());
    }

    // Assignment 2 - Create keyfunction "login" in Screens/LoginScreen
    @Test
    public void KeyFunctionTestLogin() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");
    }

    // Assignment 3 - Perform calculation
    @Test
    public void calculatorTest() {
        // Login
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction buttonThree = onView(withId(R.id.buttonThree));
        buttonThree.perform(click());

        ViewInteraction buttonAdd = onView(withId(R.id.buttonAdd));
        buttonAdd.perform(click());

        ViewInteraction buttonSix = onView(withId(R.id.buttonSix));
        buttonSix.perform(click());

        ViewInteraction buttonEqual = onView(withId(R.id.buttonEqual));
        buttonEqual.perform(click());

        ViewInteraction resultTextView = onView(withId(R.id.resultTextView));
        resultTextView.perform(click());
    }

    // Assignment 4 - Transfer everything to CalculatorScreen
    @Test
    public void RandomSubtractTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.RandomSubtract();
    }

    // Assignment 5 - Do an assertion on a result
    @Test
    public void SumWithAssertionPositiveTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.SumWithAssertionPositive();
    }

    // Assignment 6 - Make the previous test fail
    @Test
    public void SumWithAssertionNegativeTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.SumWithAssertionNegative();
    }

    // Assignment 7 - Open the hamburger menu
    @Test
    public void OpenMenu() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());
    }

    // Assignment 8 - Open WhatDoYouMeme menu item
    @Test
    public void OpenWhatDoYouMeme() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenWhatDoYouMeme();
    }

    // Assignment 9 - Open Slide show menu item
    @Test
    public void OpenSlideShow() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenSlideShow();
    }

    // Assignment 10 - Scroll up and down on WhatDoYouMeme
    @Test
    public void ScrollWhatDoYouMeme() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenWhatDoYouMeme();

        WhatDoYouMemeScreen whatDoYouMeme = new WhatDoYouMemeScreen();
        whatDoYouMeme.ScrollDown();
        whatDoYouMeme.ScrollUp();
    }
}
