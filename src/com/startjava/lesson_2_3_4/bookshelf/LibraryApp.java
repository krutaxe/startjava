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
            printBookshelf();
            MenuItem selectedItem = MenuItem.fromValue(selectMenuItem());
            if (selectedItem != null) {
                switch (selectedItem) {
                    case ADD -> addBook();
                    case FIND -> findBook();
                    case DELETE -> deleteBook();
                    case CLEAR -> clear();
                    case EXIT -> {
                        return;
                    }
                }
            } else {
                System.out.println("Ошибка: введите номер из списка: \n" + TEXT_MENU);
            }
            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            inputCheck();
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

    private static void printBookshelf() {
        if (bookshelf.getNumberOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        numberOfPlaces();
        for (Book book : bookshelf.getAll()) {
            printBook(book);
        }
    }

    private static void addBook() {
        if (bookshelf.getNumberOfBooks() >= Bookshelf.BOOKSHELF_SIZE) {
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
        scanner.nextLine();
    }

    private static void findBook() {
        int indexBook = findPosition();
        if (indexBook != -1) {
            printBook(bookshelf.getAll()[indexBook]);
        }
    }

    private static void printBook(Book book) {
        String shelf = "-".repeat(bookshelf.maxLengthName());
        System.out.printf("|%-" + bookshelf.maxLengthName() + "s|%n%s%n", book,
                "|" + shelf + "|");
    }

    private static void deleteBook() {
        int indexBook = findPosition();
        if (indexBook != -1) {
            bookshelf.delete(indexBook);
            System.out.println("Книга успешно удалена!");
        }
    }

    private static int findPosition() {
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
        scanner.nextLine();
    }

    private static void numberOfPlaces() {
        System.out.println("В шкафу книг - " + bookshelf.getNumberOfBooks() + ", свободно полок - " +
                (Bookshelf.BOOKSHELF_SIZE - bookshelf.getNumberOfBooks()) + "\n");
    }

    private static void inputCheck() {
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println("Вы ввели " + input + ". Пожалуйста, нажмите <Enter> для продолжения.");
            input = scanner.nextLine();
        }
    }
}