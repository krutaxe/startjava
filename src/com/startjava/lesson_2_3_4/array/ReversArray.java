package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ReversArray {
    public static void revers(int[] originalArray) {
        if (originalArray == null || originalArray.length == 0) {
            System.out.println("\nМассив пустой");
        } else {
            int inputArrayLength = originalArray.length;
            int[] reversArray = new int[originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                reversArray[inputArrayLength - i - 1] = originalArray[i];
            }
            System.out.println("\nДо реверса: " + Arrays.toString(originalArray));
            System.out.println("После реверса: " + Arrays.toString(reversArray));
        }
    }

    public static void main(String[] args) {
        int[] inputArray1 = {};
        int[] inputArray2 = {6, 8, 9, 1};
        int[] inputArray3 = {13, 8, 5, 3, 2, 1, 1};

        revers(null);
        revers(inputArray1);
        revers(inputArray2);
        revers(inputArray3);
    }
}