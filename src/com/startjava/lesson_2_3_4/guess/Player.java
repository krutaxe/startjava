package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int tries;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tries);
    }

    public void addNumber(int number) {
        numbers[tries] = number;
    }

    public int getLastNumber() {
        return getNumbers()[getTries() - 1];
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, tries, 0);
    }
}