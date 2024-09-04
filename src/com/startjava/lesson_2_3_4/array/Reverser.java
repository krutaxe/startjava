package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        reverse(null);
        reverse(new int[]{});
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] originalArray) {
        if (originalArray == null || originalArray.length == 0) {
            System.out.println("\nМассив пустой");
            return;
        }

        int originalArrayLen = originalArray.length;
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[originalArrayLen - i - 1] = originalArray[i];
        }
        System.out.println("\n   До реверса: " + Arrays.toString(originalArray));
        System.out.println("После реверса: " + Arrays.toString(reversedArray));
    }
}