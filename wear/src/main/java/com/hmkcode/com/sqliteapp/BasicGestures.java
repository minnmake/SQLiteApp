package com.hmkcode.com.sqliteapp;

public class BasicGestures {

    private int id;
    private String title;
    private String author;

    public BasicGestures() {
    }

    public BasicGestures(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    //getters & setters

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author
                + "]";
    }
}