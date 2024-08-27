package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class Remover {

    public static void main(String[] args) {
        removeExceedingValues(-1);
        removeExceedingValues(15);
        removeExceedingValues(0);
        removeExceedingValues(14);
    }

    public static void removeExceedingValues(int index) {
        double[] inputArray = fillArray();
        if (index > inputArray.length - 1 || index < 0) {
            System.out.println("Ошибка: индекс за пределами границ массива!\n");
            return;
        }
        double[] modArray = new double[15];
        System.arraycopy(inputArray, 0, modArray, 0, index + 1);
        outputArray(inputArray);
        outputArray(modArray);
        System.out.printf("значение из ячейки по переданному адресу " + "%.3f\n", modArray[index]);
        System.out.println("количество обнуленных ячеек " + (modArray.length - (index + 1)) + "\n");
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
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f %s", array[i], " ");
        }
        System.out.println();
    }
}
