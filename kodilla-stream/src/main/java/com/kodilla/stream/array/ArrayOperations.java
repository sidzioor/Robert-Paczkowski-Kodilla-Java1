package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream numbersForAverage = IntStream.range(0, numbers.length);
        System.out.println(numbersForAverage);
        OptionalDouble numberAverage = Arrays.stream(numbers)
                .average();

       return numberAverage.orElse(0);
    }
}
