import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2, true);
        boolean repeateble = true;

        while (repeateble) {
            int hiddenNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Компьютер загадал число!!!");

            while (guessNumber.isFlag()) {
                guessNumber.selectNumber(player1, scanner);
                guessNumber.guess(hiddenNumber, player1);

                guessNumber.selectNumber(player2, scanner);
                guessNumber.guess(hiddenNumber, player2);
            }

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            scanner.nextLine();
            String answer = scanner.nextLine();
            while (!(answer.equals("no") || answer.equals("yes"))) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("no")) {
                repeateble = false;
            } else if (answer.equals("yes")) {
                guessNumber.setFlag(true);
            }
        }
    }
}