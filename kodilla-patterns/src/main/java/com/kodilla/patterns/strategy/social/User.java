package com.kodilla.patterns.strategy.social;

public class User {
    protected SocialPublisher socialPublisher;
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public String getName() {
        return name;
    }
    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
