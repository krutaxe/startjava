package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class LibraryApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            showMenu();
            int select = scanner.nextInt();

            switch (select) {
                case 1: bookshelf.showAllBooks();
                break;
                case 2: bookshelf.addBook();
                break;
                case 3: printBook(bookshelf.findBook());
                break;
                case 4: bookshelf.deletedBook();
                break;
                case 5: bookshelf.numberOfPlaces();
                break;
                case 6: bookshelf.clear();
            }
        }
    }

    public static void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Показать все книги");
        System.out.println("2. Добавить книгу");
        System.out.println("3. Найти книгу");
        System.out.println("4. Удалить книгу");
        System.out.println("5. Статистика");
        System.out.println("6. Удалить все книги");
    }

    public static void showAllBooks() {

    }

    public static void printBook(Book book) {
        if (book == null) {
            System.out.println("Книга не найдена");
            return;
        }
        System.out.println(book);
    }
}
