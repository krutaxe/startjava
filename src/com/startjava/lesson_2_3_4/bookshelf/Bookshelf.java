package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int numberOfBooks;
    public static final Book[] BOOKS = new Book[10];

    public Bookshelf() {
        BOOKS[0] = new Book("Иван Тургенев", "Записки охотника", 1845);
        BOOKS[1] = new Book("Лев Толстой", "Война и мир", 1869);
        BOOKS[2] = new Book("Николай Носов", "Живая шляпа", 1964);
        numberOfBooks = 3;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book[] showAllBooks() {
        return Arrays.copyOf(BOOKS, numberOfBooks);
    }

    public void addBook(String nameAuthor, String title, int publicationYear) {
        if (numberOfBooks == 10) {
            System.out.println("Свободных мест в шкафу больше нет, добавить книгу невозможно");
            return;
        }
        BOOKS[numberOfBooks] = new Book(nameAuthor, title, publicationYear);
        numberOfBooks++;
    }

    public int findBook(String title) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (BOOKS[i] == null) {
                return -1;
            }
            if (title.equals(BOOKS[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public void deletedBook(int index) {
        if (index == -1) {
            return;
        }
        BOOKS[index] = null;
        numberOfBooks--;
        shiftOfBooks();
    }

    public void clear() {
        Arrays.fill(BOOKS, null);
        numberOfBooks = 0;
    }

    private void shiftOfBooks() {
        int nonNullIndex = 0;
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] != null) {
                BOOKS[nonNullIndex] = BOOKS[i];
                nonNullIndex++;
            }
        }

        for (int i = nonNullIndex; i < BOOKS.length; i++) {
            BOOKS[i] = null;
        }
    }
}
