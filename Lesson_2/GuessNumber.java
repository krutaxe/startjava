import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public boolean guess(int hiddenNumber, Player player, Scanner scanner) {
        selectNumber(player, scanner);
        boolean result = false;
        if (hiddenNumber == player.getNumber()) {
            System.out.println("Победил игрок по имени: " + player.getName());
            result = true;
        } else {
            System.out.println("Не угадал!!!");
            if (player.getNumber() > hiddenNumber) {
                System.out.println(player.getNumber() + " это больше того, что загадал компьютер");
            } else if (player.getNumber() < hiddenNumber) {
                System.out.println(player.getNumber() + " это меньше того, что загадал компьютер");
            }
        }
        return result;
    }

    private void selectNumber(Player player, Scanner scanner) {
        System.out.print("Player " + player.getName() + " введите число : ");
        player.setNumber(scanner.nextInt());
    }
}