package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private int numberPosts;

    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberPosts = numberPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberPosts=" + numberPosts +
                '}';
    }
}

