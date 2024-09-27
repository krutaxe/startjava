package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class LibraryApp {
    private static final String TEXT_MENU = """
            1. Добавить книгу
            2. Найти книгу
            3. Удалить книгу
            4. Удалить все книги
            5. Выйти
            """;
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        while (true) {
            getAllBooks();
            switch (selectMenuItem()) {
                case 1 -> addBook();
                case 2 -> findBook();
                case 3 -> deleteBook();
                case 4 -> clear();
                case 5 -> {
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
            System.out.println("\nВыберете пункт меню: \n" + TEXT_MENU);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Ошибка: введено не число. Попробуйте снова.");
            scanner.next();
        }
    }

    private static void getAllBooks() {
        numberOfPlaces();
        if (bookshelf.getNumberOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for (Book book : bookshelf.getAll()) {
            printBook(book);
        }
    }

    private static void addBook() {
        if (bookshelf.getNumberOfBooks() >= Bookshelf.getBookshelfSize()) {
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
    }

    private static void findBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            printBook(bookshelf.getBooks()[indexBook]);
        }
    }

    private static void printBook(Book book) {
        System.out.printf("|%-40s|%n%s%n", book + "г.",
                "|----------------------------------------|");
    }

    private static void deleteBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            bookshelf.deleted(indexBook);
            System.out.println("Книга успешно удалена!");
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

    private static void clear() {
        bookshelf.clear();
        System.out.println("Все книги удалены!");
    }

    private static void numberOfPlaces() {
        System.out.println("В шкафу книг - " + bookshelf.getNumberOfBooks() + ", свободно полок - " +
                (bookshelf.getBooks().length - bookshelf.getNumberOfBooks()) + "\n");
    }
}