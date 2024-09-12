package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        Calculator calculator = new Calculator();

        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение(например 2 + 5): ");
            String expression = scanner.nextLine();
            String validExpression = validateExpression(expression, scanner);
            printResult(calculator.calculate(validExpression), validExpression);
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();

            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no' : ");
                answer = scanner.nextLine();
            }
        }
        System.out.println("Завершение работы калькулятора.");
    }

    private static String validateExpression(String expression, Scanner scanner) {
        String[] elements = expression.split(" ");
        while (elements.length != 3) {
            System.out.println("Выражение введено не корректно, попробуйте ещё раз.");
            elements = scanner.nextLine().split(" ");
        }

        while (!elements[0].matches("[-+]?\\d+")) {
            System.out.print("Первое значение не является числом, введите ещё раз: ");
            elements[0] = scanner.nextLine();
        }

        while (!(elements[1].charAt(0) == '+' || elements[1].charAt(0) == '-' ||
                elements[1].charAt(0) == '*' || elements[1].charAt(0) == '/' ||
                elements[1].charAt(0) == '^' || elements[1].charAt(0) == '%')) {
            System.out.println("Ошибка: операция " + elements[1].charAt(0) + " не поддерживается.");
            System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
            System.out.print("Введите знак операции (+, -, *, /, %, ^)");
            elements[1] = scanner.nextLine();
        }

        while (!elements[2].matches("[-+]?\\d+")) {
            System.out.print("Второе значение не является числом, введите ещё раз: ");
            elements[2] = scanner.nextLine();
        }
        return elements[0] + " " + elements[1] + " " + elements[2];
    }

    private static void printResult(double result, String expression) {
        if (Double.isNaN(result)) {
            System.out.println("Ошибка: Деление на ноль или некорректная операция.");
            return;
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(expression.split("")[0] + " " + expression.split(" ")[1] +
                " " + expression.split(" ")[2] + " = " + df.format(result));
    }
}