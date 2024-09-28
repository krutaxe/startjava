package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public static final int BOOKSHELF_SIZE = 10;
    private int numberOfBooks;
    private final Book[] books = new Book[BOOKSHELF_SIZE];
    private static int lengthShelves;

    public Bookshelf() {
        books[0] = new Book("Иван Тургенев", "Записки охотника", 1845);
        books[1] = new Book("Лев Толстой", "Война и мир", 1869);
        books[2] = new Book("Николай Носов", "Живая шляпа", 1964);
        numberOfBooks = 3;
        updateLengthShelves();
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public static int getLengthShelves() {
        return lengthShelves;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, numberOfBooks);
    }

    public Book getBookByIndex(int index) {
        return books[index];
    }

    public void add(Book book) {
        books[numberOfBooks++] = book;
    }

    public int find(String title) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int index) {
        int numberElementToShift = numberOfBooks - index - 1;
        if (numberElementToShift > 0) {
            System.arraycopy(books, index + 1, books, index, numberElementToShift);
        }
        numberOfBooks--;
        books[numberOfBooks] = null;
    }

    public void clear() {
        Arrays.fill(books, 0, numberOfBooks, null);
        numberOfBooks = 0;
        lengthShelves = 0;
    }

    public void updateLengthShelves() {
        for (Book book : getAll()) {
            lengthShelves = Math.max(lengthShelves, book.toString().length());
        }
    }
}