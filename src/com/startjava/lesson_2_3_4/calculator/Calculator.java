package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public double calculate(String[] expression) {
        int num1 = Integer.parseInt(expression[0]);
        int num2 = Integer.parseInt(expression[2]);
        char operation = expression[1].charAt(0);

        if ((operation == '/' || operation == '%') && num2 == 0) {
            return Double.NaN;
        }

        double result = 0;
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '%':
                return Math.floorMod(num1, num2);
            case '^':
                return Math.pow(num1, num2);
            default:
                System.out.println("Нераспознанная операция");
        }
        return result;
    }

    public boolean isValidExpression(String[] expression, Scanner scanner) {
        if (expression.length != 3) {
            System.out.println("Выражение введено не корректно, попробуйте ещё раз.");
            return false;
        }

        while (!expression[0].matches("[-+]?\\d+")) {
            System.out.print("Первое значение не является числом, введите ещё раз: ");
            expression[0] = scanner.nextLine();
        }

        while (!(expression[1].charAt(0) == '+' || expression[1].charAt(0) == '-' || expression[1].charAt(0) == '*' ||
                expression[1].charAt(0) == '/' || expression[1].charAt(0) == '^' || expression[1].charAt(0) == '%')) {
            System.out.println("Ошибка: операция " + expression[1].charAt(0) + " не поддерживается.");
            System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
            System.out.print("Введите знак операции (+, -, *, /, %, ^)");
            expression[1] = scanner.nextLine();
        }

        while (!expression[2].matches("[-+]?\\d+")) {
            System.out.print("Второе значение не является числом, введите ещё раз: ");
            expression[2] = scanner.nextLine();
        }
        return true;
    }
}