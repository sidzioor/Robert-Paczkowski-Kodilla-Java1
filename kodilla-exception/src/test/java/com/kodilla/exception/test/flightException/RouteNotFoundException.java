package com.kodilla.exception.test.flightException;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(final String message){
        super(message);
    }
}
