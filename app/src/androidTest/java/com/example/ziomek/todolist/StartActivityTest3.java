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
public class StartActivityTest3 {

    @Rule
    public ActivityTestRule<StartActivity> mActivityTestRule = new ActivityTestRule<>(StartActivity.class);

    @Test
    public void startActivityTest3() {
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
        appCompatEditText2.perform(replaceText("QtpjE9tFSej7sxriTGPRHznWnTh9863jvwGIeU6jK0IUUTAf2b3FQdD86MUUTp75LUxT1Rkj9qCU1PXmXe1pRnPNUOzcbvmcKW6AOgnDPVpZ9C4CIFunNPIaaBHMgLxAbO0vzQTVkrHeKSBqA2029uBw9PfFF3UrlPCcGZzTNfeZ2ERsDaimM7d194Rf2cbsByn1oXs76JyeqAGKFiM3uehnA7WDlBG25IbhQWn7uLkNbUq0mVufTQ0xO8GcSfgnHGbARVAt3wxWWjuZCOj0n2tr1P7IQikdmQih45LMdPRX0n6M2PRvK8YIv5zQ8KhM1DbeRYB8Xh93roieT79u4DPmUyEDz97g7KsVOfc00KvsJ22TFzPgfvb3Esou6eKGph1XMIZsR1INGa60d8016Dw1RCS1JtyrPFQ2STdaoyaX17cgRmsM0Q4bnFl58GOQnAkh61p8CGGU7N51O5hbit6R8e9oMxlOoF8RHAfHQlNNkXmV1gLVLXfWxnxL47tBxszlLNgUQhUAZmNhqmV6RKKEpACdYcHtXvBXHN2tBFT8DiI5eIvCsmQfjfuHJBI08wmoEqXiy92AeUke2q1mAy7RowumgcHBTEpyXoIAdDOXPZ8UVx7C69ur04dGA0xVLO1Tl7OFVU7VZoTn303MOU0LDzMi8uQdLABlyssCw4M64Yf1ECteATaKkIsBeWpq2403rU775hlgdZ0T4BYGHwJquhAzRZG2g7lJGsa0iYGE8ve0NMYM74oHOyWrBfIm6EbpFgLVMNaBiLGc85eQdVrQTT1NfdnpPdd5xdAjjIaCnvNiUap2Ve1Lep5nKs7cKIvy4PtxSSjZw1Fr8RPzufE6UTKjutEw3NO9alNc8X5KoKfimTobfsF1BSkNdUQoiXLeuRdpYnXR97ptKlhplkXIyu8MkJvCcegDHn5zSjNwDgAMtDNNZC8V7ZalJ6OmRzqEax0Nej35ZpUvhZwHSReFbuiFH8G6ndCEvc02"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView10 = onView(
                allOf(withId(R.id.confirm), withContentDescription("confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView10.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.taskContent),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("Przykład"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.confirm), withContentDescription("confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.stateButton),
                        childAtPosition(
                                withParent(withId(R.id.taskList)),
                                0),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction actionMenuItemView3 = onView(
                allOf(withId(R.id.remove), withContentDescription("remove"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView3.perform(click());

        DataInteraction constraintLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.taskList),
                        childAtPosition(
                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                0)))
                .atPosition(0);
        constraintLayout.perform(click());

        ViewInteraction appCompatButton = onView(
                allOf(withId(android.R.id.button1), withText("YES"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttonPanel),
                                        0),
                                3)));
        appCompatButton.perform(scrollTo(), click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withContentDescription("Przejdź wyżej"),
                        childAtPosition(
                                allOf(withId(R.id.action_bar),
                                        childAtPosition(
                                                withId(R.id.action_bar_container),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton2.perform(click());
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
