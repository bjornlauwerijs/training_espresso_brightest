package com.example.brghtest.Screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import com.example.brghtest.R;

// Page Object Model for "Calculator" screen
public class CalculatorScreen {

    //selectors
    ViewInteraction buttonZero = onView(withId(R.id.buttonZero));
    ViewInteraction buttonOne = onView(withId(R.id.buttonOne));
    ViewInteraction buttonTwo = onView(withId(R.id.buttonTwo));
    ViewInteraction buttonThree = onView(withId(R.id.buttonThree));
    ViewInteraction buttonFour = onView(withId(R.id.buttonFour));
    ViewInteraction buttonFive = onView(withId(R.id.buttonFive));
    ViewInteraction buttonSix = onView(withId(R.id.buttonSix));
    ViewInteraction buttonSeven = onView(withId(R.id.buttonSeven));
    ViewInteraction buttonEight = onView(withId(R.id.buttonEight));
    ViewInteraction buttonNine = onView(withId(R.id.buttonNine));

    ViewInteraction buttonAdd = onView(withId(R.id.buttonAdd));
    ViewInteraction buttonSubtract = onView(withId(R.id.buttonSubtract));
    ViewInteraction buttonMultiply = onView(withId(R.id.buttonMultiply));
    ViewInteraction buttonDivide = onView(withId(R.id.buttonDivide));

    ViewInteraction buttonEqual = onView(withId(R.id.buttonEqual));

    ViewInteraction buttonDot = onView(withId(R.id.buttonDot));
    ViewInteraction resultTextView = onView(withId(R.id.resultTextView));

    public void RandomSubtract() {
        buttonSeven.perform(click());
        buttonSubtract.perform(click());
        buttonSix.perform(click());
        buttonEqual.perform(click());
    }

    public void SumWithAssertionPositive() {

        buttonSeven.perform(click());
        buttonAdd.perform(click());
        buttonSix.perform(click());
        buttonEqual.perform(click());
        resultTextView.check(matches(withText("7+6 = 13")));
    }

    public void SumWithAssertionNegative() {

        buttonSeven.perform(click());
        buttonAdd.perform(click());
        buttonSix.perform(click());
        buttonEqual.perform(click());
        resultTextView.check(matches(withText("ThisWillThrowError")));
    }

    public void Sum(int num1, int num2){
        switch(num1) {
            case 0:
                buttonZero.perform(click());
                break;
            case 1:
                buttonOne.perform(click());
                break;
            case 2:
                buttonTwo.perform(click());
                break;
            case 3:
                buttonThree.perform(click());
                break;
            case 4:
                buttonFour.perform(click());
                break;
            case 5:
                buttonFive.perform(click());
                break;
            case 6:
                buttonSix.perform(click());
                break;
            case 7:
                buttonSeven.perform(click());
                break;
            case 8:
                buttonEight.perform(click());
                break;
            case 9:
                buttonNine.perform(click());
                break;
            default:
                break;
        }
        buttonAdd.perform(click());
        switch(num2) {
            case 0:
                buttonZero.perform(click());
                break;
            case 1:
                buttonOne.perform(click());
                break;
            case 2:
                buttonTwo.perform(click());
                break;
            case 3:
                buttonThree.perform(click());
                break;
            case 4:
                buttonFour.perform(click());
                break;
            case 5:
                buttonFive.perform(click());
                break;
            case 6:
                buttonSix.perform(click());
                break;
            case 7:
                buttonSeven.perform(click());
                break;
            case 8:
                buttonEight.perform(click());
                break;
            case 9:
                buttonNine.perform(click());
                break;
            default:
                break;
        }
        int result = num1 + num2;
        buttonEqual.perform(click());
        resultTextView.check(matches(withText(num1+ "+" + num2+" = " + result)));
    }


    public void RandomSum() {
        buttonSeven.perform(click());
        buttonAdd.perform(click());
        buttonSix.perform(click());
        buttonEqual.perform(click());
    }

    public ViewInteraction getResult(){
        return resultTextView;
    }

}
