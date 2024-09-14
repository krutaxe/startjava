package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        calc(new int[]{});
        calc(null);
        calc(8, 0, 9);
        calc(-3, 1, 7, 13);
        calc(-22, -0);
    }

    private static void calc(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: массив не должен быть null.\n");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("Ошибка: массив не должен быть пустой.\n");
            return;
        }

        long[] factorials = new long[numbers.length];
        int count = 0;
        for (int num : numbers) {
            if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен");
            } else if (num == 0 || num == 1) {
                System.out.println(num + "! = 1");
                factorials[count] = 1;
                count++;
            } else {
                long factorial = 1;
                System.out.print(num + "! = " + factorial);
                for (int i = 2; i <= num; i++) {
                    factorial *= i;
                    System.out.print(" * " + i);
                }
                System.out.print(" = " + factorial);
                System.out.println();
                factorials[count] = factorial;
                count++;
            }
        }
        factorialsPrint(factorials);
        System.out.println();
    }

    private static void factorialsPrint(long[] factorials) {
        for (long factorial : factorials) {
            if (factorial != 0) {
                System.out.print(factorial + "; ");
            }
        }
        System.out.println();
    }
}