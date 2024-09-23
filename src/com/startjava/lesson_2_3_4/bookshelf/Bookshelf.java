package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int numberOfBooks;
    public final Book[] books = new Book[10];

    public Bookshelf() {
        books[0] = new Book("Иван Тургенев", "Записки охотника", 1845);
        books[1] = new Book("Лев Толстой", "Война и мир", 1869);
        books[2] = new Book("Николай Носов", "Живая шляпа", 1964);
        numberOfBooks = 3;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, numberOfBooks);
    }

    public void add(Book book) {
        books[numberOfBooks++] = book;
    }

    public int find(String title) {
        if (books[0] == null) {
            return -1;
        }
        for (int i = 0; i < numberOfBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public void deleted(int index) {
        int numElementToShift = numberOfBooks - index - 1;
        if (numElementToShift > 0) {
            System.arraycopy(books, index + 1, books, index, numElementToShift);
        }
        books[numberOfBooks - 1] = null;
        numberOfBooks--;
    }

    public void clear() {
        Arrays.fill(books, 0, numberOfBooks, null);
        numberOfBooks = 0;
    }
}