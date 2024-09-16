package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String namePlayer1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String namePlayer2 = scanner.nextLine();
        GuessNumber guessNumber = new GuessNumber(namePlayer1, namePlayer2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                guessNumber.start(scanner);
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
        System.out.println("Вы вышли из игры!");
    }
}