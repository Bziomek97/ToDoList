package com.example.ziomek.todolist;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class StartActivityTest2 {

    @Rule
    public ActivityTestRule<StartActivity> mActivityTestRule = new ActivityTestRule<>(StartActivity.class);

    @Test
    public void startActivityTest2() {
        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.add), withContentDescription("add"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("A"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.confirm), withContentDescription("confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        ViewInteraction actionMenuItemView3 = onView(
                allOf(withId(R.id.add), withContentDescription("add"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView3.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("B"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView4 = onView(
                allOf(withId(R.id.confirm), withContentDescription("confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView4.perform(click());

        ViewInteraction actionMenuItemView5 = onView(
                allOf(withId(R.id.add), withContentDescription("add"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView5.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Przejdź wyżej"),
                        childAtPosition(
                                allOf(withId(R.id.action_bar),
                                        childAtPosition(
                                                withId(R.id.action_bar_container),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction actionMenuItemView6 = onView(
                allOf(withId(R.id.add), withContentDescription("add"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView6.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText6.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("C"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView7 = onView(
                allOf(withId(R.id.confirm), withContentDescription("confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView7.perform(click());

        ViewInteraction actionMenuItemView8 = onView(
                allOf(withId(R.id.remove), withContentDescription("remove"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView8.perform(click());

        DataInteraction constraintLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.taskList),
                        childAtPosition(
                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                0)))
                .atPosition(1);
        constraintLayout.perform(click());

        ViewInteraction appCompatButton = onView(
                allOf(withId(android.R.id.button1), withText("YES"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttonPanel),
                                        0),
                                3)));
        appCompatButton.perform(scrollTo(), click());

        ViewInteraction appCompatImageButton4 = onView(
                allOf(withContentDescription("Przejdź wyżej"),
                        childAtPosition(
                                allOf(withId(R.id.action_bar),
                                        childAtPosition(
                                                withId(R.id.action_bar_container),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton4.perform(click());

        ViewInteraction actionMenuItemView9 = onView(
                allOf(withId(R.id.remove), withContentDescription("remove"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView9.perform(click());

        DataInteraction constraintLayout2 = onData(anything())
                .inAdapterView(allOf(withId(R.id.taskList),
                        childAtPosition(
                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                0)))
                .atPosition(0);
        constraintLayout2.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(android.R.id.button1), withText("YES"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttonPanel),
                                        0),
                                3)));
        appCompatButton2.perform(scrollTo(), click());

        ViewInteraction appCompatImageButton8 = onView(
                allOf(withContentDescription("Przejdź wyżej"),
                        childAtPosition(
                                allOf(withId(R.id.action_bar),
                                        childAtPosition(
                                                withId(R.id.action_bar_container),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton8.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
