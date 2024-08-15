import java.util.Random;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = random.nextInt(100) + 1;
        int answer = -1;
        while (answer != hiddenNumber) {
            System.out.print("Введите число: ");
            answer = scanner.nextInt();
            System.out.print(answer);
            if (answer > hiddenNumber) {
                System.out.println(" это больше того, что загадал компьютер");
            } else if (answer < hiddenNumber) {
                System.out.println(" это меньше того, что загадал компьютер");
            }
        }
        System.out.println(" Вы победили!!!");
    }
}