package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean(name = "toDoList")
    public Board getToDoList() {
        return new Board();
    }

    @Bean(name = "inProgressTasks")
    public Board getInProgressTask() {
        return new Board();
    }

    @Bean(name = "doneTasks")
    public Board getDoneTasks(){
        return new Board();
    }
}
