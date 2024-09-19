package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class LibraryApp {
    private static final String TEXT_MENU = """
            Меню:
            1. Показать все книги
            2. Добавить книгу
            3. Найти книгу
            4. Удалить книгу
            5. Удалить все книги
            6. Выйти
            """;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            System.out.println(TEXT_MENU);
            bookshelf.checkShelf();
            int select = scanner.nextInt();

            switch (select) {
                case 1 -> bookshelf.showAllBooks();
                case 2 -> bookshelf.addBook();
                case 3 -> bookshelf.findBook().printInfo();
                case 4 -> bookshelf.deletedBook();
                case 5 -> bookshelf.clear();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Ошибка: введите номер из списка: " + TEXT_MENU);
            }
            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            scanner.nextLine();
            scanner.nextLine();
        }
    }

    public static void printBook(Book book) {
        if (book == null) {
            System.out.println("Книга не найдена");
            return;
        }
        book.printInfo();
    }
}
