package com.startjava.lesson_2_3_4.bookshelf;

import java.util.StringJoiner;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.printf("|%-40s|%n", author + ", " + title + ", " + year);
        System.out.println("|----------------------------------------|");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("author='" + author + "'")
                .add("title='" + title + "'")
                .add("year=" + year)
                .toString();
    }
}
