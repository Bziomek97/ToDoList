package com.example.ziomek.todolist.TaskList;

public class Singleton {

    private static Repository instance = null;

    private Singleton(){}

    public static Repository getInstance(){
        if(instance==null) instance = new Repository();
        return instance;
    }
}
