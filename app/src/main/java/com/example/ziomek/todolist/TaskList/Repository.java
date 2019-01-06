package com.example.ziomek.todolist.TaskList;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Repository {

    private static Repository instance = null;

    private ArrayList<Task> tasksList = null;

    private Repository() {
        this.tasksList = new ArrayList<>();
    }

    public static Repository getInstance(){
        if(instance == null) instance = new Repository();
        return instance;
    }

    public void add(String content){
        Task newTask = new Task();
        newTask.setContent(content);
        this.tasksList.add(newTask);
    }

    public ArrayList<Task> getAll(){
        return this.tasksList;
    }

    public Task getItem(int index){
        return this.tasksList.get(index);
    }

    public ArrayList<String> getTasks(){
        ArrayList<String> tmp = new ArrayList<>();

        for(Task i: this.tasksList){
            tmp.add(i.getContent());
        }
        return tmp;
    }

    public int getSize(){
        return this.tasksList.size();
    }
}
