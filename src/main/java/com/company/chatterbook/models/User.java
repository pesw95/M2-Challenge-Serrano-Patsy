package com.company.chatterbook.models;

import java.util.List;

public class User {

    private String name;
    private List<ChatterPost> chatterPosts;

//    Constructor with name as Parameter

    public User(String name) {
        this.name = name;
    }

//    Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }
}
