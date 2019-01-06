package com.example.ziomek.todolist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ziomek.todolist.TaskList.Repository;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lv = (ListView) findViewById(R.id.taskList);
        taskList = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this,R.layout.row,R.id.row,taskList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Repository.getInstance().remove((String) parent.getItemAtPosition(position));
                adapter.clear();
                if(Repository.getInstance().getSize() > 0) adapter.addAll(Repository.getInstance().getTasks());
                lv.setAdapter(adapter);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.clear();
        if(Repository.getInstance().getSize() > 0) adapter.addAll(Repository.getInstance().getTasks());
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
