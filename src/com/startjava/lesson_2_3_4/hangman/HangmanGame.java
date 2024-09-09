package com.startjava.lesson_2_3_4.hangman;

import java.lang.Character.UnicodeScript;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {

    private static final String[] words = {"телефон", "дом", "кошка", "компьютер", "зонт", "дерево"};
    private static final String[] gallows = {
            "____ \n",
            "   |   \n",
            "   |   \n",
            "   O   \n",
            "  /|\\ \n",
            "  / \\ \n"
    };
    private static int tries;

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        String hiddenWord = randomWord();
        String[] hiddenWordLetters = hiddenWord.split("");
        String[] guessLetters = new String[hiddenWord.length()];
        StringBuilder missingLetters = new StringBuilder();
        Arrays.fill(guessLetters, "_");

        print(guessLetters);
        Scanner sc = new Scanner(System.in);
        while (!isGuessesWord(guessLetters) && !((gallows.length - tries) == 0)) {
            System.out.print("\nВведите букву: ");
            String letter = sc.nextLine();

            if (letter.isBlank()) {
                System.out.println("Пустая строка, ведите букву!");
                continue;
            }

            if (!letter.matches("[а-яА-Я]")) {
                System.out.println("Пожалуйста, введите букву из кириллицы.(а-я, А-Я)");
                continue;
            }

            if (isExistMissingLetters(missingLetters, letter) || isExistGuessLetter(guessLetters, letter)) {
                System.out.println("Вы уже вводили букву: " + letter);
                continue;
            }

            if (!isExistLetter(hiddenWordLetters, letter, guessLetters) &&
                    !missingLetters.toString().contains(letter.toUpperCase())) {
                missingLetters.append(letter.toUpperCase()).append(" ");
                tries++;
            }

            System.out.print("Угадываемое слово ");
            print(guessLetters);
            System.out.println("Ошибочные буквы: " + missingLetters);
            System.out.println("Оставшееся количество попыток " + (gallows.length - tries));

            if (isGuessesWord(guessLetters)) {
                System.out.println("Вы победили!!!");
                return;
            }

            drawGallows(tries);

            if ((gallows.length - tries) == 0) {
                System.out.println("Вы проиграли!!!");
            }
        }
    }

    private static String randomWord() {
        return words[(int) (Math.random() * words.length)];
    }

    private static boolean isExistLetter(String[] hiddenWordLetters, String letter, String[] guessLetters) {
        boolean exist = false;
        for (int i = 0; i < hiddenWordLetters.length; i++) {
            if (hiddenWordLetters[i].equalsIgnoreCase(letter)) {
                if (tries > 0 && tries < gallows.length && !isExistGuessLetter(guessLetters, letter)) {
                    tries--;
                }
                exist = true;
                guessLetters[i] = letter.toUpperCase();
            }
        }
        return exist;
    }

    private static boolean isGuessesWord(String[] guessLetters) {
        for (String letter : guessLetters) {
            if (letter.equals("_")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isExistGuessLetter(String[] guessLetters, String letter) {
        for (String str : guessLetters) {
            if (letter.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isExistMissingLetters(StringBuilder missingLetters, String letter) {
        return missingLetters.toString().contains(letter.toUpperCase());
    }

    private static void print(String[] letters) {
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    private static void drawGallows(int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(gallows[i]);
        }
    }
}