package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.swipeDown;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

//Dit is de POM voor het WhatDoYouMeme scherm
public class WhatDoYouMemeScreen {

    ViewInteraction scrollView = onView(withId(R.id.imageScrollView));

    public void ScrollDown(){
        scrollView.perform(swipeUp());
    }

    public void ScrollUp(){
        scrollView.perform(swipeDown());
    }
}
