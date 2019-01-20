package com.example.ziomek.todolist;

import android.support.test.filters.LargeTest;
import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import com.example.ziomek.todolist.TaskList.Repository;
import com.example.ziomek.todolist.TaskList.Task;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@SmallTest
@RunWith(AndroidJUnit4.class)
public class AddActivityTest {

    @Rule
    public ActivityTestRule<AddActivity> mActivityTestRule = new ActivityTestRule<>(AddActivity.class);

    @Before
    public void setUp(){
        EditText m = (EditText) mActivityTestRule.getActivity().findViewById(R.id.taskContent);
        m.setText('A');
    }

    @Test
    public void test() {
        mActivityTestRule.getActivity().confirm();
        System.out.print(Repository.getInstance().getTasks());

    }
}