package com.example.ziomek.todolist.TaskList;

public class Task {

    private String content;
    private boolean state;

    public Task() {
        this.state = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
