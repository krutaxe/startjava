import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean flag;

    public GuessNumber(Player player1, Player player2, boolean flag) {
        this.player1 = player1;
        this.player2 = player2;
        this.flag = flag;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void guess(int hiddenNumber, Player player) {
        if (hiddenNumber == player.getNumber()) {
            System.out.println("Победил игрок по имени: " + player.getName());
            flag = false;
        } else {
            System.out.println("Не угадал!!!");
            if (player.getNumber() > hiddenNumber) {
                System.out.println(player.getNumber() + " это больше того, что загадал компьютер");
            } else if (player.getNumber() < hiddenNumber) {
                System.out.println(player.getNumber() + " это меньше того, что загадал компьютер");
            }
        }
    }

    public void selectNumber(Player player, Scanner scanner) {
        System.out.print("Player " + player.getName() + " введите число : ");
        player.setNumber(scanner.nextInt());
    }
}