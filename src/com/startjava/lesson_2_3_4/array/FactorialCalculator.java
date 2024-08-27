package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {

    public static void main(String[] args) {
        calculateFactorial(new int[]{});
        calculateFactorial(null);
        calculateFactorial(8, 0, 9);
        calculateFactorial(-3, 1, 7, 13);
        calculateFactorial(-22, -0);
    }

    public static void calculateFactorial(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: массив не должен быть null.\n");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("Ошибка: массив не должен быть пустой.\n");
            return;
        }

        for (Integer num : numbers) {
            if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен");
            } else if (num == 0 || num == 1) {
                System.out.println(num + "! = 1");
            } else {
                long factorial = 1;
                System.out.print(num + "! = " + factorial);
                for (int i = 2; i <= num; i++) {
                    factorial *= i;
                    System.out.print(" * " + i);
                }
                System.out.print(" = " + factorial);
                System.out.println();
            }
        }
        System.out.println();
    }
}