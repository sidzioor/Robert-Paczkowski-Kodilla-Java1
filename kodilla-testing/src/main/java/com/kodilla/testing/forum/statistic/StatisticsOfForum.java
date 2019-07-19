package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;

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
            averagePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.commentsCount() != 0 && statistics.usersNames().size() != 0) {
            averageCommentPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        } else {
            averageCommentPerUser = 0;
        }
        if (statistics.postsCount() != 0 && statistics.postsCount() != 0) {
            averageCommentPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        } else {
            averageCommentPerPost = 0;
        }
    }

    public ArrayList<String> showStatistics() {
        ArrayList<String> averagesList = new ArrayList<>();
        averagesList.add(0, String.format("%.2f", averagePostsPerUser));
        averagesList.add(1, String.format("%.2f", averageCommentPerUser));
        averagesList.add(2, String.format("%.2f", averageCommentPerPost));
        return averagesList;
    }
}
