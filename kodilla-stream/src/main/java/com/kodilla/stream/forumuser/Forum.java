package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList= new ArrayList<>();
    public Forum(){
        usersList.add(new ForumUser(0,"user0",'M',1998,2,13,15));
        usersList.add(new ForumUser(1,"user1",'M',1984,4,6,8));
        usersList.add(new ForumUser(2,"user2",'F',1991,10,29,24));
        usersList.add(new ForumUser(3,"user3",'M',1999,8,20,1));
        usersList.add(new ForumUser(4,"user4",'F',1988,9,13,104));
        usersList.add(new ForumUser(5,"user5",'F',1987,12,31,24));
        usersList.add(new ForumUser(6,"user6",'M',1997,1,7,0));
        usersList.add(new ForumUser(7,"user7",'F',1993,5,15,87));
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
