package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimplyUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testCaseUsername(){
        //Given
        SimplyUser simplyUser = new SimplyUser("theForumUser");
        //When
        String result = simplyUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);
    }
}
