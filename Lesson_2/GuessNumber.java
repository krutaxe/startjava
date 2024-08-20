import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner scanner) {
        int hiddenNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число!!!");
        while (true) {
            inputNumber(player1, scanner);
            if (isGuessed(player1, hiddenNumber)) {
                break;
            }
            inputNumber(player2, scanner);
            if (isGuessed(player2, hiddenNumber)) {
                break;
            }
        }
    }

    private void inputNumber(Player player, Scanner scanner) {
        System.out.print(player.getName() + " введите число ");
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        if (hiddenNumber == player.getNumber()) {
            System.out.println("Победил игрок по имени: " + player.getName());
            return true;
        }
        System.out.println("Не угадал!!!");
        if (player.getNumber() > hiddenNumber) {
            System.out.println(player.getNumber() + " это больше того, что загадал компьютер");
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println(player.getNumber() + " это меньше того, что загадал компьютер");
        }
        return false;
    }
}