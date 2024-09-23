package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class LibraryApp {
    private static final String TEXT_MENU = """
            1. Показать все книги
            2. Добавить книгу
            3. Найти книгу
            4. Удалить книгу
            5. Удалить все книги
            6. Выйти
            """;
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        while (true) {
            switch (selectMenuItem()) {
                case 1 -> getAllBooks();
                case 2 -> addBook();
                case 3 -> findBook();
                case 4 -> deletedBook();
                case 5 -> clear();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Ошибка: введите номер из списка: \n" + TEXT_MENU);
            }
            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            scanner.nextLine();
            scanner.nextLine();
        }
    }

    private static int selectMenuItem() {
        while (true) {
            System.out.println("Выберете пункт меню: \n" + TEXT_MENU);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
                scanner.next();
            }
        }
    }

    private static void getAllBooks() {
        if (bookshelf.books[0] == null) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for (Book book : bookshelf.getAll()) {
            printBook(book);
        }
        numberOfPlaces();
    }

    private static void printBook(Book book) {
        System.out.printf("|%-40s|%n%s", book.toString() + "г.",
                "|----------------------------------------|\n");
    }

    private static void addBook() {
        if (bookshelf.getNumberOfBooks() >= 10) {
            System.out.println("Свободных мест в шкафу больше нет, добавить книгу невозможно");
            return;
        }
        scanner.nextLine();
        System.out.print("Введите имя автора: ");
        String nameAuthor = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int publicationYear;
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не число. Попробуйте снова.");
            System.out.print("Введите год издания: ");
            scanner.next();
        }
        publicationYear = scanner.nextInt();
        bookshelf.add(new Book(nameAuthor, title, publicationYear));
        numberOfPlaces();
    }

    private static void findBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            printBook(bookshelf.books[indexBook]);
        }
    }

    private static int searchIndexBook() {
        scanner.nextLine();
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        int indexBook = bookshelf.find(title);
        if (indexBook == -1) {
            System.out.println("Книга не найдена!");
        }
        return indexBook;
    }

    private static void deletedBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            bookshelf.deleted(indexBook);
            System.out.println("Книга успешно удалена!");
            numberOfPlaces();
        }
    }

    private static void clear() {
        bookshelf.clear();
        System.out.println("Все книги удалены!");
    }

    private static void numberOfPlaces() {
        System.out.println("В шкафу книг - " + bookshelf.getNumberOfBooks() + ", свободно полок - " +
                (bookshelf.books.length - bookshelf.getNumberOfBooks()) + "\n");
    }
}