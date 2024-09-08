package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class Filler {

    public static void main(String[] args) {
        fillUniqueNumbers(-10, 20, 23);
        fillUniqueNumbers(-30, 10, 10);
        fillUniqueNumbers(-34, -34, 0);
        fillUniqueNumbers(-1, 2, -3);
        fillUniqueNumbers(5, -8, 2);
    }

    public static void fillUniqueNumbers(int start, int end, int numbersPerLine) {
        if (!isValidInput(start, end, numbersPerLine)) {
            return;
        }

        int len = (int) ((end - start) * 0.75);
        int[] uniqueNumbers = new int[len];
        Random random = new Random();
        for (int i = 0; i < uniqueNumbers.length; i++) {
            int randomNumber = random.nextInt(end - start + 1) + start;
            if (!isUnique(uniqueNumbers, randomNumber, i)) {
                i--;
            }
        }

        Arrays.sort(uniqueNumbers);
        System.out.println();
        outputArray(uniqueNumbers, numbersPerLine);
        System.out.println();
    }

    private static boolean isValidInput(int start, int end, int numbersPerLine) {
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
            System.out.printf("%4d", array[i]);
        }
        System.out.println();
    }

    private static boolean isUnique(int[] uniqueNumbers, int randomNumber, int index) {
        for (int uniqueNumber : uniqueNumbers) {
            if (uniqueNumber == randomNumber) {
                return false;
            }
        }
        uniqueNumbers[index] = randomNumber;
        return true;
    }
}