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
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Bookshelf BOOKSHELF = new Bookshelf();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберете пункт меню: \n" + TEXT_MENU);
            checkShelf();

            int select;
            if (SCANNER.hasNextInt()) {
                select = SCANNER.nextInt();
            } else {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
                SCANNER.next();
                continue;
            }

            switch (select) {
                case 1 -> showAllBooks();
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
            SCANNER.nextLine();
            SCANNER.nextLine();
        }
    }

    private static void checkShelf() {
        for (Book book : Bookshelf.BOOKS) {
            if (book != null) {
                return;
            }
        }
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
    }

    private static void showAllBooks() {
        Book[] books = BOOKSHELF.showAllBooks();
        if (books.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for (Book book : BOOKSHELF.showAllBooks()) {
            System.out.println(book);
        }
    }

    private static void addBook() {
        SCANNER.nextLine();
        System.out.print("Введите имя автора: ");
        String nameAuthor = SCANNER.nextLine();
        System.out.print("Введите название книги: ");
        String title = SCANNER.nextLine();
        System.out.print("Введите год издания: ");
        int publicationYear;
        while (!SCANNER.hasNextInt()) {
            System.out.println("Ошибка: введено не число. Попробуйте снова.");
            System.out.print("Введите год издания: ");
            SCANNER.next();
        }
        publicationYear = SCANNER.nextInt();
        BOOKSHELF.addBook(nameAuthor, title, publicationYear);
        numberOfPlaces();
    }

    private static int searchIndexBook() {
        SCANNER.nextLine();
        System.out.println("Введите название книги: ");
        String title = SCANNER.nextLine();
        int indexBook = BOOKSHELF.findBook(title);
        if (indexBook == -1) {
            System.out.println("Книга не найдена!");
        }
        return indexBook;
    }

    private static void findBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            System.out.println(Bookshelf.BOOKS[indexBook]);
        }
    }

    private static void deletedBook() {
        int indexBook = searchIndexBook();
        if (indexBook != -1) {
            BOOKSHELF.deletedBook(indexBook);
            System.out.println("Книга успешно удалена!");
            numberOfPlaces();
        }
    }

    private static void clear() {
        BOOKSHELF.clear();
        System.out.println("Все книги удалены!");
        numberOfPlaces();
    }

    private static void numberOfPlaces() {
        System.out.println("В шкафу книг - " + BOOKSHELF.getNumberOfBooks() + ", свободно полок - " +
                (Bookshelf.BOOKS.length - BOOKSHELF.getNumberOfBooks()) + "\n");
    }
}
