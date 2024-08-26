package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(int num1, int num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                result = num1;
                for (int i = 1; i <= Math.abs(num2) - 1; i++) {
                    result *= num1;
                }
                return num2 < 0 ? 1 / result : result;
            default:
                System.out.println("Нераспознанная операция");
        }
        return result;
    }
}