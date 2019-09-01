package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean toDoListExist = context.containsBean("toDoList");
        //Then
        System.out.println("Bean toDoList was found in the container: " + toDoListExist);
    }

    @Test
    public void testInProgressTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean inProgressTasksExist = context.containsBean("inProgressTasks");
        //Then
        System.out.println("Bean inProgressTasks was found in the container: " + inProgressTasksExist);
    }

    @Test
    public void testDoneTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean doneTasksExist = context.containsBean("doneTasks");
        //Then
        System.out.println("Bean doneTasks was found in the container: " + doneTasksExist);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board listTodo = (Board) context.getBean("toDoList");
        List<String> toDoList = Arrays.asList("To do Task");
        TaskList tasksToDo = new TaskList(toDoList);
        Board inProgress = (Board) context.getBean("inProgressTasks");
        List<String> inProgressTask = Arrays.asList("In progress task");
        TaskList tasksInProgress = new TaskList(inProgressTask);
        Board doneTasks = (Board) context.getBean("doneTasks");
        List<String> doneTask = Arrays.asList("Done task");
        TaskList tasksDone = new TaskList(doneTask);
        //When
        System.out.println(listTodo.listToDo(tasksToDo));
        System.out.println(inProgress.tasksInProgress(tasksInProgress));
        System.out.println(doneTasks.doneTasks(tasksDone));
        //Then
        //do nothing

    }
}
