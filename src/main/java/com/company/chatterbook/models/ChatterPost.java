package com.company.chatterbook.models;

public class ChatterPost {

    private String text;

//    Constructor

    public ChatterPost(String text) {
        this.text = text;
    }

//    Getters and Setters for getting Text

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
