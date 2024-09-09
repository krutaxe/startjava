package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return Double.NaN;
                }
                return num1 / num2;
            case '%':
                return Math.floorMod((int) num1, (int) num2);
            case '^':
                return Math.pow(num1, num2);
            default:
                System.out.println("Нераспознанная операция");
        }
        return result;
    }
}