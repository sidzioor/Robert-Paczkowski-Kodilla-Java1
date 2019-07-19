package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.Statistics;
import com.kodilla.testing.forum.statistic.StatisticsOfForum;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsOfForumTestSuite {
    @Test
    public void testStatisticsOfForum() {
        //Given
        Statistics namesMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        namesList.add("user1");
        namesList.add("user2");
        namesList.add("user3");
        namesList.add("user4");
        when(namesMock.usersNames()).thenReturn(namesList);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(namesMock);

        //When
        int numberOfUsers = statisticsOfForum.numberOfUsers();

        //Then
        Assert.assertEquals(4, numberOfUsers);
    }

    @Test
    public void testNumberOfPosts() {
        //Given
        Statistics postsCountMock = mock(Statistics.class);
        when(postsCountMock.postsCount()).thenReturn(6);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(postsCountMock);

        //When
        int quantityOfPosts = statisticsOfForum.quantityOfPosts();

        //Then
        Assert.assertEquals(6, quantityOfPosts);
    }

    @Test
    public void testNumberOfComments() {
        //Given
        Statistics commentsCountMock = mock(Statistics.class);
        when(commentsCountMock.commentsCount()).thenReturn(12);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(commentsCountMock);

        //When
        int quantityOfComments = statisticsOfForum.quantityOfComments();

        //Then
        Assert.assertEquals(12, quantityOfComments);
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Test when userNames=100 && postsCount>commentCount 
        //Given 
        Statistics averageMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String user = "user" + i;
            namesList.add(user);
        }
        when(averageMock.usersNames()).thenReturn(namesList);
        when(averageMock.postsCount()).thenReturn(336);
        when(averageMock.commentsCount()).thenReturn(723);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(averageMock);

        //When
        statisticsOfForum.calculateAdvStatistics(averageMock);
        ArrayList<String> averagesList = statisticsOfForum.showStatistics();
        String averages0 = averagesList.get(0);
        String averages1 = averagesList.get(1);
        String averages2 = averagesList.get(2);

        //Then
        Assert.assertEquals("3,36", averages0);
        Assert.assertEquals("7,23", averages1);
        Assert.assertEquals("2,15", averages2);
    }

    @Test
    public void testCalculateAdvStatistics1() {
        //Test when userNames=100 && postsCount=1000
        //Given
        Statistics averageMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String user = "user" + i;
            namesList.add(user);
        }
        when(averageMock.usersNames()).thenReturn(namesList);
        when(averageMock.postsCount()).thenReturn(6742);
        when(averageMock.commentsCount()).thenReturn(1000);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(averageMock);

        //When
        statisticsOfForum.calculateAdvStatistics(averageMock);
        ArrayList<String> averagesList = statisticsOfForum.showStatistics();
        String averages0 = averagesList.get(0);
        String averages1 = averagesList.get(1);
        String averages2 = averagesList.get(2);

        //Then
        Assert.assertEquals("67,42", averages0);
        Assert.assertEquals("10,00", averages1);
        Assert.assertEquals("0,15", averages2);
    }

    @Test
    public void testCalculateAdvStatistics2() {
        //Test when userNames=0 && postsCount<commentsCount
        //Given
        Statistics averageMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        when(averageMock.usersNames()).thenReturn(namesList);
        when(averageMock.postsCount()).thenReturn(723);
        when(averageMock.commentsCount()).thenReturn(336);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(averageMock);

        //When
        statisticsOfForum.calculateAdvStatistics(averageMock);
        ArrayList<String> averagesList = statisticsOfForum.showStatistics();
        String averages0 = averagesList.get(0);
        String averages1 = averagesList.get(1);
        String averages2 = averagesList.get(2);

        //Then
        Assert.assertEquals("0,00", averages0);
        Assert.assertEquals("0,00", averages1);
        Assert.assertEquals("0,46", averages2);
    }
    @Test
    public void testCalculateAdvStatistics3() {
        //Test when postsCount=0
        //Given
        Statistics averageMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String user = "user" + i;
            namesList.add(user);
        }
        when(averageMock.usersNames()).thenReturn(namesList);
        when(averageMock.postsCount()).thenReturn(0);
        when(averageMock.commentsCount()).thenReturn(336);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(averageMock);

        //When
        statisticsOfForum.calculateAdvStatistics(averageMock);
        ArrayList<String> averagesList = statisticsOfForum.showStatistics();
        String averages0 = averagesList.get(0);
        String averages1 = averagesList.get(1);
        String averages2 = averagesList.get(2);

        //Then
        Assert.assertEquals("0,00", averages0);
        Assert.assertEquals("3,36", averages1);
        Assert.assertEquals("0,00", averages2);
    }
    @Test
    public void testCalculateAdvStatistics4() {
        //Test when userNames=100 && postsCount>commentCount
        //Given
        Statistics averageMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String user = "user" + i;
            namesList.add(user);
        }
        when(averageMock.usersNames()).thenReturn(namesList);
        when(averageMock.postsCount()).thenReturn(336);
        when(averageMock.commentsCount()).thenReturn(0);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum(averageMock);

        //When
        statisticsOfForum.calculateAdvStatistics(averageMock);
        ArrayList<String> averagesList = statisticsOfForum.showStatistics();
        String averages0 = averagesList.get(0);
        String averages1 = averagesList.get(1);
        String averages2 = averagesList.get(2);

        //Then
        Assert.assertEquals("3,36", averages0);
        Assert.assertEquals("0,00", averages1);
        Assert.assertEquals("0,00", averages2);
    }
}
