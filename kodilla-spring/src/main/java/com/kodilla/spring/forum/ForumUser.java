package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser() {
        username = "Jhon Smith";
    }

    public String getUsername() {
        return username;
    }
}
