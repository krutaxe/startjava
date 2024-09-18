package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private int numberOfBooks;
    private Book[] books = new Book[10];
    private Scanner scanner = new Scanner(System.in);

    public Bookshelf() {
        books[0] = new Book("Пушкин", "Сказка", 1990);
        books[1] = new Book("Толстой", "Война и мир", 1857);
        books[2] = new Book("Гоголь", "Мертвый души", 1925);
        books[3] = new Book("Лермонтов", "Рассказ", 1890);
        books[4] = new Book("Носов", "Стих", 1990);
        numberOfBooks = 5;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void showAllBooks() {
        if (books == null) {
            System.out.println("В шкафу нет книг");
            return;
        }
        for (Book book : books) {
            if (book == null) {
                break;
            }
            System.out.println(book);
        }
        numberOfPlaces();
    }

    public void addBook() {
        if (numberOfBooks == 10) {
            System.out.println("Свободных мест в шкафу больше нет, добавить книгу невозможно");
            return;
        }
        System.out.print("Введите имя автора: ");
        String nameAuthor = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String nameBook = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(nameAuthor, nameBook, year);
        books[numberOfBooks] = book;
        numberOfBooks++;
        numberOfPlaces();
    }

    public Book findBook() {
        System.out.println("Введите название книги: ");
        String nameBook = scanner.nextLine();
        for (Book book : books) {
            if (book == null) return null;
            if (nameBook.equals(book.getBookName())) {
                return book;
            }
        }
        numberOfPlaces();
        return null;
    }

    public void deletedBook() {
        System.out.println("Введите название книги: ");
        String nameBook = scanner.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            if (nameBook.equals(books[i].getBookName())) {
                books[i] = null;
                numberOfBooks--;
            }
        }
        shiftOfBooks();
        numberOfPlaces();
    }

    public void numberOfPlaces() {
        System.out.println("В шкафу книг - " + numberOfBooks + ", свободных полок - " +
                (books.length - numberOfBooks));
    }

    public void shiftOfBooks() {
        int nonNullIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[nonNullIndex] = books[i];
                nonNullIndex++;
            }
        }

        for (int i = nonNullIndex; i < books.length; i++) {
            books[i] = null;
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        numberOfBooks = 0;
    }
}
