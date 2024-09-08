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
        if (!isValidText(text)) {
            return;
        }

        String[] words = text.split("[\\s.,!?;:'\"(){}\\[\\]<>-]+");

        int indexWordMinLength = findMinLengthWord(words);
        int indexWordMaxLength = findMaxLengthWord(words);

        if (indexWordMinLength > indexWordMaxLength) {
            int swapIndex = indexWordMinLength;
            indexWordMinLength = indexWordMaxLength;
            indexWordMaxLength = swapIndex;
        }

        String[] wordsWithPunctuation = text.split(" ");

        for (int i = 0; i < wordsWithPunctuation.length; i++) {
            if (wordsWithPunctuation[i].equals("-") && i < indexWordMinLength) {
                indexWordMinLength++;
                indexWordMaxLength++;
            }
            if (i >= indexWordMinLength && i <= indexWordMaxLength) {
                wordsWithPunctuation[i] = wordsWithPunctuation[i].toUpperCase();
            }
        }
        printLetterByLetter(wordsWithPunctuation);
        System.out.println();
    }

    private static boolean isValidText(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("Ошибка: текст не должен быть пустой.");
            return false;
        }
        return true;
    }

    private static int findMaxLengthWord(String[] words) {
        String maxLength = words[0];
        int result = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (maxLength.length() < words[i].length()) {
                maxLength = words[i];
                result = i;
            }
        }
        return result;
    }

    private static int findMinLengthWord(String[] words) {
        String minLength = words[0];
        int result = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (minLength.length() > words[i].length()) {
                minLength = words[i];
                result = i;
            }
        }
        return result;
    }

    private static void printLetterByLetter(String[] text) throws InterruptedException {
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