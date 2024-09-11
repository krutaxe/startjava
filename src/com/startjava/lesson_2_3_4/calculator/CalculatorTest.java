package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        Calculator calculator = new Calculator();

        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение(например 2 + 5): ");
            String expression = scanner.nextLine();
            calculator.printResult(calculator.calculate(expression), expression);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        System.out.println("Завершение работы калькулятора.");
    }
}