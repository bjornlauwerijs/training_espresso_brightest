package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

// Page Object Model for main menu
public class MenuScreen {
    // ViewInteraction menuItemWhatDoYouMeme = onView(withText("What do you meme?"));
    ViewInteraction menuItemWhatDoYouMeme = onView(withId(R.id.nav_gallery));
    // ViewInteraction menuSlideshow = onView(withText("Slideshow"));
    ViewInteraction menuSlideshow = onView(withId(R.id.nav_slideshow));

    public void OpenWhatDoYouMeme(){
        menuItemWhatDoYouMeme.perform(click());
    }
    public void OpenSlideShow(){
        menuSlideshow.perform(click());
    }
}