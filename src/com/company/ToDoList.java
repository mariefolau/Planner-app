package com.company;

public class ToDoList {
    int id;
    String task;
    int priority;
    String notes;

    public ToDoList(int id, String task, int priority, String notes) {
        this.id = id;
        this.task = task;
        this.priority = priority;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
