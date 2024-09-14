package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int tries;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
        this.tries = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tries + 1);
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void addNumber(int number, int tries) {
        numbers[tries] = number;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, getNumbers().length - 1, 0);
    }
}