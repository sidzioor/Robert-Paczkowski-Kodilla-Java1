package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        if (numbers.length > 0) {
            IntStream numbersForAverage = IntStream.range(0, numbers.length);
            System.out.println(numbersForAverage);
            double numberAverage = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average().getAsDouble();
            return numberAverage;
        } else {
            return 0.000;
        }
    }
}
