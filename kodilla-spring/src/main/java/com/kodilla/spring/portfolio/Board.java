package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressTask;
    TaskList doneList;


    public String listToDo(TaskList toDoList) {
        this.toDoList = toDoList;
        return "Tasks to do: " + toDoList;
    }

    public String tasksInProgress(TaskList inProgressTask) {
        this.inProgressTask = inProgressTask;
        return "Tasks in progress: " + inProgressTask;
    }

    public String doneTasks(TaskList doneList) {
        this.doneList = doneList;
        return "Task done: " + doneList;
    }
}
