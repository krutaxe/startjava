import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answerRepeate = "yes";

        while (answerRepeate.equals("yes")) {
            int hiddenNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Компьютер загадал число!!!");

            while (true) {
                if (guessNumber.guess(hiddenNumber, player1, scanner)) {
                    break;
                }
                if (guessNumber.guess(hiddenNumber, player2, scanner)) {
                    break;
                }
            }

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            scanner.nextLine();
            String answer = scanner.nextLine();
            while (!(answer.equals("no") || answer.equals("yes"))) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("no")) {
                answerRepeate = "no";
                System.out.println("Game over!!!");
            }
        }
    }
}