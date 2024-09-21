package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.printf("|%-40s|%n", author + ", " + title + ", " + year);
        System.out.println("|----------------------------------------|");
    }
}
