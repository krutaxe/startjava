package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";

        while (answer.equals("yes")) {
            guessNumber.start(scanner);
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                scanner.nextLine();
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        System.out.println("Вы вышли из игры!");
    }
}