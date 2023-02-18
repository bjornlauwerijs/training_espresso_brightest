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

    //Eerste snelle test
    @Test
    public void loginTest() {
        //id kan je ophalen in activity_main.xml
        ViewInteraction emailtextField = onView(withId(R.id.usernameTextField)).perform(closeSoftKeyboard());
        emailtextField.perform(typeText("admin"));

        ViewInteraction passwordtextField = onView(withId(R.id.passwordTextField)).perform(closeSoftKeyboard());
        passwordtextField.perform(typeText("admin"));

        ViewInteraction loginButton = onView(withId(R.id.loginButton)).perform(closeSoftKeyboard());
        loginButton.perform(click());
    }

    //Gebruiken van keyfunctions (LoginScreen aanmaken en daar de functie schrijven)
    @Test
    public void KeyFunctionTestLogin() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");
    }

    //Eerste snelle test calculator
    //inloggen en dan calc test uitvoeren
    @Test
    public void calculatorTest() {
        //inloggen
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        //id kan je ophalen in activity_main.xml
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

    //Gebruiken van keyfunctions (LoginScreen aanmaken en daar de functie schrijven)
    @Test
    public void RandomSubtractTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.RandomSubtract();
    }

    @Test
    public void RandomSumTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.RandomSum();
    }

    @Test
    public void RandomMultiplyTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.RandomMultiply();
    }

    @Test
    public void RandomDivideTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.RandomDivide();
    }

    @Test
    public void SumWithAssertionPositiveTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.SumWithAssertionPositive();
    }

    @Test
    public void SumWithAssertionNegativeTest() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        CalculatorScreen calculatorScreen = new CalculatorScreen();
        calculatorScreen.SumWithAssertionNegative();
    }

    @Test
    public void ClickhamburgerMenu() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());
    }

    @Test
    public void OpenWhatDoYouMeme() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenWhatDoyouMeme();
    }

    @Test
    public void ScrollWhatDoYouMeme() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login("admin","admin");

        ViewInteraction menuButton = onView(withContentDescription("Open navigation drawer"));
        menuButton.perform(click());

        MenuScreen menuScreen = new MenuScreen();
        menuScreen.OpenWhatDoyouMeme();

        WhatDoYouMemeScreen whatDoYouMeme = new WhatDoYouMemeScreen();
        whatDoYouMeme.ScrollDown();
        whatDoYouMeme.ScrollUp();
    }
}
