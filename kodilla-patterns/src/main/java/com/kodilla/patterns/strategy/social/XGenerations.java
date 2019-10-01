package com.kodilla.patterns.strategy.social;

public class XGenerations extends User{
    public XGenerations(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
