package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        this.player1 = new Player(namePlayer1);
        this.player2 = new Player(namePlayer2);
    }

    public void start(Scanner scanner) {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        int hiddenNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число!!!");
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
    }

    public void printEnteredNumbers() {
        int[] enteredNumbersPlayer1 = Arrays.copyOf(player1.getNumbers(), player1.getTries());
        int[] enteredNumbersPlayer2 = Arrays.copyOf(player2.getNumbers(), player2.getTries());
        for (int j : enteredNumbersPlayer1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : enteredNumbersPlayer2) {
            System.out.print(j + " ");
        }
    }

    private void inputNumber(Player player, Scanner scanner) {
        System.out.print(player.getName() + " введите число ");
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        player.getNumbers()[player.getTries()] = player.getNumber();
        player.setTries(player.getTries() + 1);
        if (hiddenNumber == player.getNumber()) {
            System.out.println(player.getName() + " угадал число " + hiddenNumber + " c " + player.getTries() + "-й попытки");
            return true;
        }
        System.out.println("Не угадал!!!");
        if (player.getNumber() > hiddenNumber) {
            System.out.println(player.getNumber() + " это больше того, что загадал компьютер");
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println(player.getNumber() + " это меньше того, что загадал компьютер");
        }
        return false;
    }

    private boolean hasTries(Player player) {
        if (player.getTries() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return false;
        }
        return true;
    }
}