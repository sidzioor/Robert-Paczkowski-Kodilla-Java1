package com.kodilla.testing.colection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> withoutOddNumbers = new ArrayList<>();
        for (Integer findOdd : numbers) {
            if (findOdd % 2 == 0) {
                withoutOddNumbers.add(findOdd);
            }
        }
        return withoutOddNumbers;
    }
}
