package com.startjava.lesson_2_3_4.bookshelf;

import java.util.StringJoiner;

public class Book {
    private String author;
    private String bookName;
    private int year;

    public Book(String author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("author='" + author + "'")
                .add("bookName='" + bookName + "'")
                .add("year=" + year)
                .toString();
    }
}
