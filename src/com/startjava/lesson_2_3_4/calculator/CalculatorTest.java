package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение(например 2 + 5): ");
            String[] expression = scanner.nextLine().split(" ");
            if (expression.length != 3) {
                System.out.println("Выражение введено не корректно, попробуйте ещё раз.");
                continue;
            }

            Calculator calculator = new Calculator();
            DecimalFormat dc;
            double result = calculator.calculate(expression);
            if (result % 1 == 0) {
                dc = new DecimalFormat("#");
            } else {
                dc = new DecimalFormat("#.###");
            }
            System.out.println(expression[0] + " " + expression[1] + " " + expression[2] + " = " + dc.format(result));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        System.out.println("Завершение работы калькулятора.");
    }
}