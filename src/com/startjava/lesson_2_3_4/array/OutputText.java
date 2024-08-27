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
        if (isNull(text) || isEmpty(text)) {
            return;
        }
        String[] words = text.split("[\\s,.-]+");

        int indexWordMinLength = findMinLengthWord(words);
        int indexWordMaxLength = findMaxLengthWord(words);
        if (indexWordMinLength > indexWordMaxLength) {
            int swapIndex = indexWordMinLength;
            indexWordMinLength = indexWordMaxLength;
            indexWordMaxLength = swapIndex;
        }

        String[] wordsWithPunctuation = text.split(" ");
        for (int i = 0; i < wordsWithPunctuation.length; i++) {
            if (i >= indexWordMinLength && i <= indexWordMaxLength) {
                wordsWithPunctuation[i] = wordsWithPunctuation[i].toUpperCase();
            }
        }

        for (String word : wordsWithPunctuation) {
            String[] letter = word.split("");
            for (String l : letter) {
                System.out.print(l);
                Thread.sleep(100);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    private static boolean isNull(String text) {
        if (text == null) {
            System.out.println("Ошибка: текст не должен быть null.");
            return true;
        }
        return false;
    }

    private static boolean isEmpty(String text) {
        if (text.length() == 0) {
            System.out.println("Ошибка: текст не должен быть пустой.");
            return true;
        }
        return false;
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
}