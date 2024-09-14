package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class Remover {
    public static void main(String[] args) {
        removeExceedingValues(-1);
        removeExceedingValues(15);
        removeExceedingValues(0);
        removeExceedingValues(14);
    }

    private static void removeExceedingValues(int index) {
        double[] inputArray = fillArray();
        if (index < 0 || index > (inputArray.length - 1)) {
            System.out.println("Ошибка: индекс за пределами границ массива!\n");
            return;
        }
        double[] modArray = new double[15];
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[index]) {
                modArray[i] = 0;
                count++;
            } else {
                modArray[i] = inputArray[i];
            }
        }

        outputArray(inputArray);
        outputArray(modArray);
        System.out.printf("""
                        значение из ячейки по переданному адресу %.3f
                        %s
                        """, modArray[index],
                "количество обнуленных ячеек " + count);
    }

    private static double[] fillArray() {
        Random random = new Random();
        double[] randomNumbers = new double[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextDouble();
        }
        return randomNumbers;
    }

    private static void outputArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length + 1) / 2) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();
    }
}