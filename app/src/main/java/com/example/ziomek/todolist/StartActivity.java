package com.example.ziomek.todolist;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ziomek.todolist.TaskList.Repository;
import com.example.ziomek.todolist.TaskList.Task;
import com.example.ziomek.todolist.TaskList.TaskAdapter;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private ListView lv;
    private TaskAdapter adapter;
    private ArrayList<String> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        lv = (ListView) findViewById(R.id.taskList);
        taskList = new ArrayList<String>();
        adapter = new TaskAdapter(this);
        lv.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lv.setAdapter(null);
        adapter = new TaskAdapter(this);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                this.addItem();
                return true;
            case R.id.remove:
                this.removeItem();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void addItem(){
        startActivity(new Intent(this, AddActivity.class));
    }

    public void removeItem(){
        startActivity(new Intent(this, RemoveActivity.class));
    }
}
