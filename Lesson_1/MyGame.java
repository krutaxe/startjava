import java.util.Random;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = random.nextInt(0, 100);
        int answer = -1;
        while (answer != hiddenNumber) {
            System.out.print("Введите число: ");
            answer = scanner.nextInt();
            if (answer > hiddenNumber) {
                System.out.println("Это больше того, что загадал компьютер");
            } else if (answer < hiddenNumber) {
                System.out.println("Это меньше того, что загадал компьютер");
            }
        }
        System.out.println("Вы победили!!!");
    }
}