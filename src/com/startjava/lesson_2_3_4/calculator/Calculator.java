package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String[] expression) {

        double num2 = Integer.parseInt(expression[2]);
        final double num1 = Integer.parseInt(expression[0]);
        char operation = expression[1].charAt(0);
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