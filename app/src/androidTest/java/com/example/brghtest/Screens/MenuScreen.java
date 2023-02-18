package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

//Dit is de POM voor het menu
public class MenuScreen {
    ViewInteraction menuItemWhatDoYouMeme = onView(withText("What do you meme?"));
    ViewInteraction menuSlideshow = onView(withText("Slideshow"));

    public void OpenWhatDoyouMeme(){
        menuItemWhatDoYouMeme.perform(click());
    }
    public void OpenSlideShow(){
        menuSlideshow.perform(click());
    }
}
