package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticsOfForum {
    Statistics statistics;
    double averagePostsPerUser = 0.0;
    double averageCommentPerUser = 0.0;
    double averageCommentPerPost = 0.0;

    public StatisticsOfForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public int numberOfUsers() {
        int numberOfUsers = statistics.usersNames().size();
        return numberOfUsers;
    }

    public int quantityOfPosts() {
        int postsQuantity = statistics.postsCount();
        return postsQuantity;
    }

    public int quantityOfComments() {
        int commentsQuantity = statistics.commentsCount();
        return commentsQuantity;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.postsCount() != 0 && statistics.usersNames().size() != 0) {
            averagePostsPerUser = (double)statistics.postsCount() / (double)statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.commentsCount() != 0 && statistics.usersNames().size() != 0) {
            averageCommentPerUser = (double)statistics.commentsCount() / (double) statistics.usersNames().size();
        } else {
            averageCommentPerUser = 0;
        }
        if (statistics.postsCount() != 0 && statistics.postsCount() != 0) {
            averageCommentPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        } else {
            averageCommentPerPost = 0;
        }
    }

    public String showStatistics() {
        return "Average posts per user = " + String.format("%.2f", averagePostsPerUser) + "\n" +
                "Average comment per user = " + String.format("%.2f", averageCommentPerUser) +
                "\n" + "Average comments per post = " + String.format("%.2f", averageCommentPerPost);
    }
}
