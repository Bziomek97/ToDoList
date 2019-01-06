package com.example.ziomek.todolist.TaskList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.ziomek.todolist.R;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends BaseAdapter implements ListAdapter {

    private Context context;
    private List<Task> content;

    public TaskAdapter(List<Task> tasks, Context context){
        content=tasks;
        this.context=context;
    }



    @Override
    public int getCount() {
        return content.size();
    }

    @Override
    public Object getItem(int position) {
        return content.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.row2, null);
        }

        TextView txt = (TextView) view.findViewById(R.id.taskContent);
        txt.setText(content.get(position).getContent());

        final ImageButton stateButton = (ImageButton) view.findViewById(R.id.stateButton);
        stateButton.setBackgroundColor(Color.rgb(144,238,144));
        stateButton.setImageResource(R.drawable.done);
        stateButton.performClick();

        stateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content.get(position).isState()){
                    stateButton.setBackgroundColor(Color.rgb(144,238,144));
                    stateButton.setImageResource(R.drawable.done);
                    content.get(position).setState(false);
                }
                else{
                    stateButton.setBackgroundColor(Color.rgb(255,204,203));
                    stateButton.setImageResource(R.drawable.undone);
                    content.get(position).setState(true);
                }
            }
        });
        return view;
    }
}
