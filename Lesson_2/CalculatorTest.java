import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerRepeate = "yes";

        while (answerRepeate.equals("yes")) {
            System.out.print("Введите первое число: ");
            final int num1 = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, %, ^)");
            char operation = scanner.next().charAt(0);

            while (!(operation == '+' || operation == '-' || operation == '*' || 
                    operation == '/' || operation == '^' || operation == '%')) {
                System.out.println("Ошибка: операция " + operation + " не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
                System.out.print("Введите знак операции (+, -, *, /, %, ^)");
                operation = scanner.next().charAt(0);
            }

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            if ((operation == '/' || operation == '%') && num2 == 0) {
                System.out.println("Ошибка: деление на ноль запрещено!!!");
            }
            
            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, num2, operation);
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            String answer = scanner.nextLine();
            while (!(answer.equals("no") || answer.equals("yes"))) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("no")) {
                answerRepeate = "no";
                System.out.println("Завершение работы калькулятора.");
            }
        }
    }
}