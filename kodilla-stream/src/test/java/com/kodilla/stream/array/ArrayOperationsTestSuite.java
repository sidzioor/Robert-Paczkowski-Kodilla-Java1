package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers[] = {20,15,25,30,35,45,10,265,15,64,15,74,14,15,35,97,874,174,9878};

        //When
        double averageOfNumbers = getAverage(numbers);

        //Then
        Assert.assertEquals(615.789,averageOfNumbers, 0.001);
    }
}
