package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public double calculate(String expression) {
        Scanner scanner = new Scanner(System.in);
        isValidExpression(expression, scanner);

        String[] expressionArray = expression.split(" ");
        int num1 = Integer.parseInt(expressionArray[0]);
        int num2 = Integer.parseInt(expressionArray[2]);
        char operation = expressionArray[1].charAt(0);

        if ((operation == '/' || operation == '%') && num2 == 0) {
            return Double.NaN;
        }

        double result = 0;
        switch (operation) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return (double) num1 / num2;
            }
            case '%' -> {
                return Math.floorMod(num1, num2);
            }
            case '^' -> {
                return Math.pow(num1, num2);
            }
            default -> System.out.println("Нераспознанная операция");
        }
        return result;
    }

    private void isValidExpression(String expression, Scanner scanner) {
        String[] expressionArray = expression.split(" ");
        while (expressionArray.length != 3) {
            System.out.println("Выражение введено не корректно, попробуйте ещё раз.");
            expressionArray = scanner.nextLine().split(" ");
        }

        while (!expressionArray[0].matches("[-+]?\\d+")) {
            System.out.print("Первое значение не является числом, введите ещё раз: ");
            expressionArray[0] = scanner.nextLine();
        }

        while (!(expressionArray[1].charAt(0) == '+' || expressionArray[1].charAt(0) == '-' ||
                expressionArray[1].charAt(0) == '*' || expressionArray[1].charAt(0) == '/' ||
                expressionArray[1].charAt(0) == '^' || expressionArray[1].charAt(0) == '%')) {
            System.out.println("Ошибка: операция " + expressionArray[1].charAt(0) + " не поддерживается.");
            System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
            System.out.print("Введите знак операции (+, -, *, /, %, ^)");
            expressionArray[1] = scanner.nextLine();
        }

        while (!expressionArray[2].matches("[-+]?\\d+")) {
            System.out.print("Второе значение не является числом, введите ещё раз: ");
            expressionArray[2] = scanner.nextLine();
        }
    }

    public void printResult(double result, String expression) {
        if (Double.isNaN(result)) {
            return;
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(expression.split("")[0] + " " + expression.split(" ")[1] +
                " " + expression.split(" ")[2] + " = " + df.format(result));
    }
}