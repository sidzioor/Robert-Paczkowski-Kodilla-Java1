package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    @Autowired
    Display display;
    public double add(double a, double b){
        a+=b;
        display.displayValue(a);
        return a;
    }
    public double sub(double a, double b){
        a-=b;
        display.displayValue(a);
        return a;
    }
    public double mul(double a, double b){
        a*=b;
        display.displayValue(a);
        return a;
    }
    public double div(double a, double b){
        a/=b;
        display.displayValue(a);
        return a;
    }
}
