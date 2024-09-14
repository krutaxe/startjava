package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        char operation = elements[1].charAt(0);

        return switch (operation) {
            case '+': yield num1 + num2;
            case '-': yield num1 - num2;
            case '*': yield num1 * num2;
            case '/': {
                if (num2 == 0) {
                    yield Double.NaN;
                }
                yield (double) num1 / num2;
            }
            case '%': {
                if (num2 == 0) {
                    yield Double.NaN;
                }
                yield Math.floorMod(num1, num2);
            }
            case '^': yield Math.pow(num1, num2);
            default: throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}