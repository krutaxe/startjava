package com.startjava.lesson_2_3_4.array;

public class OutputCharacter {

    public static void main(String[] args) {
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
    }

    public static void printTriangle(char start, char end, boolean sort) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")\n");
            return;
        }

        int maxRows = end - start;
        StringBuilder triangle = new StringBuilder();
        if (sort) {
            for (int value = start; value <= end + 1; value++) {
                appendRow(triangle, value, start, maxRows);
            }
        } else {
            for (int value = end; value >= start; value--) {
                appendRowRevers(triangle, value, start, end);
            }
        }
        System.out.println(triangle);
    }

    private static void appendRow(StringBuilder stringBuilder, int value, int start, int maxRows) {
        stringBuilder.append(" ".repeat(Math.max(0, maxRows - (value - start - 1))));
        stringBuilder.append(String.valueOf((char) (value - 1)).repeat(Math.max(0, ((value - start) * 2 - 1))));
        stringBuilder.append(System.lineSeparator());
    }

    private static void appendRowRevers(StringBuilder stringBuilder, int value, int start, int end) {
        stringBuilder.append(" ".repeat(Math.max(0, (value - start))));
        stringBuilder.append(String.valueOf((char) (value)).repeat(Math.max(0, ((end - value) * 2 - 1))));
        stringBuilder.append(System.lineSeparator());
    }
}