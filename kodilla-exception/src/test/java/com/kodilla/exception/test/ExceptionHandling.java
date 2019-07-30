package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();
        try{
            challenge.probablyIWillThrowException(2.5,4.3);
        }catch(Exception e){
            System.out.println("We have problem here! "+ e);
        }finally{
            System.out.println("If you see problems check class: SecondChallenge. If you don't you are lucker");
        }
    }
}
