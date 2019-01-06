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

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        lv = (ListView) findViewById(R.id.taskList);
        taskList = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this,R.layout.row,R.id.row,taskList);
        lv.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.clear();
        if(Repository.getInstance().getSize() > 0) adapter.addAll(Repository.getInstance().getTasks());
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
