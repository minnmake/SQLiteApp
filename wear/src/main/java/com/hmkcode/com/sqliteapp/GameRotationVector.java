package com.hmkcode.com.sqliteapp;

public class GameRotationVector{

    private int id;
    private String title;
    private String author;

    public GameRotationVector() {
    }

    public GameRotationVector(String title, String author) {
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