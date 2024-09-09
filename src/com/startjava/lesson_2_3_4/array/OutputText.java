package com.startjava.lesson_2_3_4.array;

public class OutputText {

    public static void main(String[] args) throws InterruptedException {
        typewriterEffect("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n"
                + "- James Gosling");
        typewriterEffect("Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n"
                + "- Robert Martin");

        typewriterEffect(null);
        typewriterEffect("");
    }

    public static void typewriterEffect(String text) throws InterruptedException {
        if (!isValidText(text)) return;

        String[] noPunctuation = text.split("[\\s\\p{P}]+");

        int indexWordMinLength = 0;
        int indexWordMaxLength = 0;

        for (int i = 1; i < noPunctuation.length; i++) {
            if (noPunctuation[indexWordMaxLength].length() < noPunctuation[i].length()) {
                indexWordMaxLength = i;
            }
            if (noPunctuation[indexWordMinLength].length() > noPunctuation[i].length()) {
                indexWordMinLength = i;
            }
        }

        if (indexWordMinLength > indexWordMaxLength) {
            int swapIndex = indexWordMinLength;
            indexWordMinLength = indexWordMaxLength;
            indexWordMaxLength = swapIndex;
        }

        String[] withPunctuation = text.split(" ");

        for (int i = 0; i < withPunctuation.length; i++) {
            if (withPunctuation[i].equals("-") && i < indexWordMinLength) {
                indexWordMinLength++;
                indexWordMaxLength++;
            }
            if (i >= indexWordMinLength && i <= indexWordMaxLength) {
                withPunctuation[i] = withPunctuation[i].toUpperCase();
            }
        }
        printLetters(withPunctuation);
        System.out.println();
    }

    private static boolean isValidText(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("Ошибка: текст не должен быть пустой.");
            return false;
        }
        return true;
    }

    private static void printLetters(String[] text) throws InterruptedException {
        for (String word : text) {
            String[] letter = word.split("");
            for (String l : letter) {
                System.out.print(l);
                Thread.sleep(100);
            }
            System.out.print(" ");
        }
    }
}