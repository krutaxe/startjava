package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] numbers = new  int[10];
    private int tries;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }
}