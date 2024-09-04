package com.startjava.lesson_2_3_4.array;

public class OutputCharacter {

    public static void main(String[] args) {
        sortedCharTriangle('0', '9', true);
        sortedCharTriangle('/', '!', false);
        sortedCharTriangle('A', 'J', false);
    }

    public static void sortedCharTriangle(char start, char end, boolean sort) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")\n");
            return;
        }

        int maxRows = end - start;
        StringBuilder stringBuilder = new StringBuilder();
        if (sort) {
            for (int value = start; value <= end + 1; value++) {
                appendRow(stringBuilder, value, start, maxRows);
            }
        } else {
            for (int value = end + 1; value > start; value--) {
                appendRow(stringBuilder, value, start, maxRows);
            }
        }
        System.out.println(stringBuilder);
    }

    private static void appendRow(StringBuilder stringBuilder, int value, int start, int maxRows) {
        stringBuilder.append(" ".repeat(Math.max(0, maxRows - (value - start - 1))));
        stringBuilder.append(String.valueOf((char) (value - 1)).repeat(Math.max(0, ((value - start) * 2 - 1))));
        stringBuilder.append(System.lineSeparator());
    }
}