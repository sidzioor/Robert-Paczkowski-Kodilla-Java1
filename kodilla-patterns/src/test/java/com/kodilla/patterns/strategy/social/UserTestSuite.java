package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User maria = new YGeneration("Maria Dunkan");
        User michael = new XGenerations("Michael Sankt");

        //When
        String johnPreferSocial = john.sharePost();
        System.out.println(john.getName() + " " + johnPreferSocial);
        String mariaPreferSocial = maria.sharePost();
        System.out.println(maria.getName() + " " + mariaPreferSocial);
        String michaelPreferSocial = michael.sharePost();
        System.out.println(michael.getName() + " " + michaelPreferSocial);

        //Then
        Assert.assertEquals("favorite social is: Snapchat", johnPreferSocial);
        Assert.assertEquals("favorite social is: Facebook", mariaPreferSocial);
        Assert.assertEquals("favorite social is: Twitter", michaelPreferSocial);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User smith = new Millenials("John Smith");

        //When
        String johnPreferSocial = smith.sharePost();
        System.out.println(smith.getName() + " " + johnPreferSocial);
        smith.setSocialPublisher(new FacebookPublisher());
        johnPreferSocial = smith.sharePost();
        System.out.println(smith.getName() + " " + johnPreferSocial);

        //Then
        Assert.assertEquals("favorite social is: Facebook", johnPreferSocial);
    }
}
