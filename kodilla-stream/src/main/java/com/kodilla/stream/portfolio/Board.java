package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final String name;
    private final List<TaskList> taskLists = new ArrayList<>();

    public Board(String name) {
        this.name = name;
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }
    public void addTaskList(TaskList taskList){
        taskLists.add(taskList);
    }
    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", taskLists=" + taskLists +
                '}';
    }
}
