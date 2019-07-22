package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> 2019-forumUser.getBirthDate().getYear()>=20)
                .filter(forumUser -> forumUser.getNumberPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()+ ": "+entry.getValue())
                .forEach(System.out::println);
    }
}
