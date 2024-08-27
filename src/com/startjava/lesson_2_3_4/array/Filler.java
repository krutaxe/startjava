package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class Filler {

    public static void main(String[] args) {
        fillUniqueValues(-10, 20, 23);
        System.out.println();

        fillUniqueValues(-30, 10, 10);
        System.out.println();

        fillUniqueValues(-34, -34, 0);
        System.out.println();

        fillUniqueValues(-1, 2, -3);
        System.out.println();

        fillUniqueValues(5, -8, 2);
    }

    public static void fillUniqueValues(int start, int end, int numbersPerLine) {
        if (!validateInput(start, end, numbersPerLine)) {
            return;
        }

        int newArrayLen = (int) ((end - start) * 0.75);
        int[] array = new int[newArrayLen];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        outputArray(array, numbersPerLine);
        Arrays.sort(array);
        System.out.println();
        outputArray(array, numbersPerLine);
    }

    private static boolean validateInput(int start, int end, int numbersPerLine) {
        boolean isValid = true;
        if (numbersPerLine < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" + numbersPerLine + ")");
            isValid = false;
        }

        if ((end - start) <= 0) {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + (end - start) + ")");
            isValid = false;
        }

        if (start > end) {
            System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            isValid = false;
        }
        return isValid;
    }

    private static void outputArray(int[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            if (i % numbersPerLine == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
