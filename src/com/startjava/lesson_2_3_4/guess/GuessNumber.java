package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        this.player1 = new Player(namePlayer1);
        this.player2 = new Player(namePlayer2);
    }

    public void start(Scanner scanner) {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        System.out.println("Компьютер загадал число!!!");
        int hiddenNumber = (int) (Math.random() * 100) + 1;
        player1.setTries(0);
        player2.setTries(0);

        while (true) {
            inputNumber(player1, scanner);
            if (isGuessed(player1, hiddenNumber)) {
                break;
            }
            boolean hasTriesPlayer1 = hasTries(player1);

            inputNumber(player2, scanner);
            if (isGuessed(player2, hiddenNumber)) {
                break;
            }
            boolean hasTriesPlayer2 = hasTries(player2);

            if (!hasTriesPlayer1 && !hasTriesPlayer2) {
                System.out.println("Никто не выиграл!");
                break;
            }
        }
        printEnteredNumbers(player1);
        printEnteredNumbers(player2);
        player1.clearNumbers();
        player2.clearNumbers();
    }

    private void inputNumber(Player player, Scanner scanner) {
        System.out.print(player.getName() + " введите число ");
        player.addNumber(scanner.nextInt(), player.getTries());
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int inputNumber = player.getNumbers()[player.getTries()];
        player.setTries(player.getTries() + 1);
        if (hiddenNumber == inputNumber) {
            System.out.println(player.getName() + " угадал число " + hiddenNumber +
                    " c " + player.getTries() + "-й попытки");
            return true;
        }
        System.out.println("Не угадал!!!");
        if (inputNumber > hiddenNumber) {
            System.out.println(inputNumber + " это больше того, что загадал компьютер");
        } else {
            System.out.println(inputNumber + " это меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printEnteredNumbers(Player player) {
        for (int i = 0; i < player.getNumbers().length - 1; i++) {
            System.out.print(player.getNumbers()[i] + " ");
        }
        System.out.println();
    }

    private boolean hasTries(Player player) {
        if (player.getTries() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return false;
        }
        return true;
    }
}