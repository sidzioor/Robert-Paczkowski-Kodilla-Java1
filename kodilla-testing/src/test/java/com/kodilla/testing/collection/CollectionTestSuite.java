package com.kodilla.testing.collection;

import com.kodilla.testing.colection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void Before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void After(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testNumbersEmptyList = new ArrayList<>();
        ArrayList<Integer> testExpectedEmptyList = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testNumbersEmptyList);
        System.out.println("Testing empty list");
        Assert.assertEquals(testExpectedEmptyList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testNumberNormalList = new ArrayList<>();
        ArrayList<Integer> testExpectedNormalList = new ArrayList<>();
        testNumberNormalList.add(1);
        testNumberNormalList.add(2);
        testNumberNormalList.add(3);
        testNumberNormalList.add(4);
        testExpectedNormalList.add(2);
        testExpectedNormalList.add(4);
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testNumberNormalList);
        System.out.println("Testing normal list");
        Assert.assertEquals(testExpectedNormalList, result);
    }
}
