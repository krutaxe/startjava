package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("|%-40s|%n%s", author + ", " + title + ", " + publicationYear + "г.",
                "|----------------------------------------|");
    }
}
