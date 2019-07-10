package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimplyUser;

public class TestingMain {
    public static void main(String[] args) {
        SimplyUser simplyUser = new SimplyUser("theForumUser");
        String result = simplyUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
            ;
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy");

        System.out.println("Test of add()");
        Calculator calculator = new Calculator();
        int numberOne = 211;
        int numberTwo = 160;

        int resultAdd = calculator.add(numberOne, numberTwo);
        if (resultAdd == numberOne + numberTwo) {
            System.out.println("test OK!");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test of substract()");
        int resultSubstract = calculator.substract(numberOne, numberTwo);
        if (resultSubstract == numberOne - numberTwo) {
            System.out.println("test OK!");
        } else {
            System.out.println("Error!");
        }
    }
}

