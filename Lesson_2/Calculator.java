public class Calculator {
    public double calculation(int num1, int num2, char operation) {
        double result = -1;;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                double temp = result;
                if (num2 < 0) {
                    num2 *= -1;
                    for (int i = 1; i <= num2 - 1; i++) {
                        temp *= num1;
                    }
                    result = 1 / temp;
                } else {
                    result = temp;
                }
                break;
            default:
                break;
        }
        return result;
    }
}