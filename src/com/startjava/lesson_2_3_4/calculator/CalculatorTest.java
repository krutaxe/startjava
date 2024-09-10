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
            String[] expression = scanner.nextLine().split(" ");
            if (!calculator.isValidExpression(expression, scanner)) continue;

            double result = calculator.calculate(expression);
            if (Double.isNaN(result)) {
                System.out.println("Результат: Not-a-Number");
            } else {
                printResult(expression, result);
            }

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        System.out.println("Завершение работы калькулятора.");
    }

    public static void printResult(String[] expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(expression[0] + " " + expression[1] + " " + expression[2] + " = " + df.format(result));
    }
}