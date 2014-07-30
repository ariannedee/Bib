package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String formattedBook() {
       return String.format("%-10.10s %-10.10s %s", title, author, yearPublished);
    }
}
