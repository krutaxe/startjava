package com.startjava.lesson_2_3_4.array;

public class OutputCharacter {

    public static void main(String[] args) {
        sortedCharTriangle('0', '9', true);
        sortedCharTriangle('/', '!', false);
        sortedCharTriangle('A', 'J', false);
    }

    public static void sortedCharTriangle(char start, char end, boolean sort) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (sort) {
            for (int i = start; i <= end + 1; i++) {
                int count = i - start;
                String string = String.valueOf((char) (i - 1)).repeat(count);
                stringBuilder.append(string).append(System.lineSeparator());
            }
        } else {
            for (int i = end; i >= start - 1; i--) {
                int count = end - i;
                String string = String.valueOf((char) (i + 1)).repeat(count);
                stringBuilder.append(string).append(System.lineSeparator());
            }
        }
        System.out.println(stringBuilder);
    }
}
