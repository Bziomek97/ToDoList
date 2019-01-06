package com.example.ziomek.todolist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ziomek.todolist.TaskList.Repository;

import java.util.Objects;

public class AddActivity extends AppCompatActivity {

    private EditText content;
    private TextView counter,hint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        counter = (TextView)findViewById(R.id.counter);
        hint = (TextView)findViewById(R.id.hint);
        content = (EditText)findViewById(R.id.taskContent);

        content.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                counter.setText(String.format("%s/255", String.valueOf(s.length())));
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>255) {
                    content.setTextColor(Color.RED);
                    hint.setTextColor(Color.RED);
                    counter.setTextColor(Color.RED);
                }
                else{
                    content.setTextColor(Color.BLACK);
                    hint.setTextColor(Color.BLACK);
                    counter.setTextColor(Color.BLACK);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_remove_toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.confirm:
                this.confirm();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void confirm(){
        Context con = getApplicationContext();
        CharSequence text = "I can't create this task, cause it is too long for me :C";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(con,text,duration);

        String result = content.getText().toString();

        if(result.length()>255) {
            toast.show();
        }
        else{
            Repository.getInstance().add(result);
            onBackPressed();
        }
    }
}
