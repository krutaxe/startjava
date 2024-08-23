package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Какую операцию хотите выполнить? (+, -, *, /, %, ^) ");
        char operation = scanner.next().charAt(0);
        int result = -1;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '%') {
            result = num1 % num2;
        } else if (operation == '^') {
            result = num1;
            for (int i = 1; i <= num2 - 1; i++) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}