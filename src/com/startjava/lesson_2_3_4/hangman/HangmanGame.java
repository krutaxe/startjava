package com.startjava.lesson_2_3_4.hangman;

import java.lang.Character.UnicodeScript;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {

    private static final String[] WORDS = {"телефон", "дом", "кошка", "компьютер", "зонт", "дерево"};
    private static final String[] HANGMAN_ARRAY = {
            "____ \n",
            "   |   \n",
            "   |   \n",
            "   O   \n",
            "  /|\\ \n",
            "  / \\ \n"
    };
    private static final int MAX_TRIES = HANGMAN_ARRAY.length;
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
        while (!isGuessesWord(guessLetters) && !((MAX_TRIES - tries) == 0)) {
            System.out.print("\nВведите букву: ");
            String letter = sc.nextLine();

            if (letter.isBlank()) {
                System.out.println("Пустая строка, ведите букву!");
                continue;
            }

            if (!isCyrillicLetter(letter)) {
                System.out.println("Вы ввели не правильный символ!");
                continue;
            }

            if (isExistMissingLetters(missingLetters, letter) || isExistGuessLetter(guessLetters, letter)) {
                System.out.println("Вы уже вводили букву: " + letter);
            }

            if (!isExistLetter(hiddenWordLetters, letter, guessLetters) &&
                    !missingLetters.toString().contains(letter.toUpperCase())) {
                missingLetters.append(letter.toUpperCase()).append(" ");
                tries++;
            }

            System.out.print("Угадываемое слово ");
            print(guessLetters);
            System.out.println("Ошибочные буквы: " + missingLetters);
            System.out.println("Оставшееся количество попыток " + (MAX_TRIES - tries));
            hangmanPrint(tries);
        }

        if (MAX_TRIES == tries) {
            System.out.println("Вы проиграли!!!");
        } else {
            System.out.println("Вы победили!!!");
        }

    }

    private static String randomWord() {
        return WORDS[(int) (Math.random() * WORDS.length)];
    }

    private static boolean isExistLetter(String[] hiddenWordLetters, String letter, String[] guessLetters) {
        boolean exist = false;
        for (int i = 0; i < hiddenWordLetters.length; i++) {
            if (hiddenWordLetters[i].equalsIgnoreCase(letter)) {
                if (tries > 0 && tries < MAX_TRIES && !isExistGuessLetter(guessLetters, letter)) {
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

    private static boolean isCyrillicLetter(String letter) {
        char ch = letter.charAt(0);
        return Character.UnicodeScript.of(ch) == UnicodeScript.CYRILLIC;
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

    private static void hangmanPrint(int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(HangmanGame.HANGMAN_ARRAY[i]);
        }
    }
}