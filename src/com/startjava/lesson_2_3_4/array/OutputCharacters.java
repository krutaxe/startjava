package com.startjava.lesson_2_3_4.array;

public class OutputCharacters {
    public static void main(String[] args) {
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
    }

    public static void printTriangle(char start, char end, boolean asc) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")\n");
            return;
        }

        int maxRows = end - start;
        StringBuilder triangle = new StringBuilder();
        if (asc) {
            for (int i = start; i <= end + 1; i++) {
                appendRow(triangle, true, i, start, maxRows);
            }
        } else {
            for (int i = end; i >= start; i--) {
                appendRow(triangle, false, i, start, maxRows);
            }
        }
        System.out.println(triangle);
    }

    private static void appendRow(StringBuilder triangle, boolean asc, int value, int start, int maxRows) {
        int spaces = asc ? maxRows - (value - start - 1) : value - start;
        int repeats = asc ? Math.max(0, ((value - start) * 2 - 1)) :
                Math.max(0, ((maxRows + start - value) * 2 - 1));
        value = asc ? (value - 1) : value;

        triangle.append(" ".repeat(Math.max(0, spaces)));
        triangle.append(String.valueOf((char) value).repeat(repeats));
        triangle.append(System.lineSeparator());
    }
}