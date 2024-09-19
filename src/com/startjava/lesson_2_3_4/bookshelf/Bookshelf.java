package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private int numberOfBooks;
    private Book[] books = new Book[10];
    private final Scanner scanner = new Scanner(System.in);

    public Bookshelf() {
        books[0] = new Book("Иван Тургенев", "Записки охотника", 1845);
        books[1] = new Book("Лев Толстой", "Война и мир", 1869);
        books[2] = new Book("Николай Носов", "Живая шляпа", 1964);
        numberOfBooks = 3;
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
        numberOfPlaces();
        for (Book book : books) {
            if (book == null) {
                break;
            }
            book.printInfo();
        }
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
            if (nameBook.equals(book.getTitle())) {
                return book;
            }
        }
        numberOfPlaces();
        return null;
    }

    public void deletedBook() {
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                books[i] = null;
                numberOfBooks--;
                System.out.println("Книга с названием: " + title + " - успешно удалена!");
            }
        }
        shiftOfBooks();
        numberOfPlaces();
    }

    public void numberOfPlaces() {
        System.out.println("В шкафу книг - " + numberOfBooks + ", свободно полок - " +
                (books.length - numberOfBooks) + "\n");
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

    public void checkShelf() {
        for (Book book : books) {
            if (book != null) {
                return;
            }
        }
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
    }
}
