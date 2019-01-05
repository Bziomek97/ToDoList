package com.example.ziomek.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
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
