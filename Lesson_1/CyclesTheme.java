public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumNotEven = 0;
        System.out.print("В отрезке [" + start + ", " + end);
        do {
            if (start % 2 == 0) {
                sumEven += start;
            } else {
                sumNotEven += start;
            }
            start++;
        } while (start <= end);
        System.out.println("] сумма четных чисел = " + sumEven + ", а нечетных = " + sumNotEven);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else if (num3 >= num1 && num3 >= num2) {
            max = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else if (num3 <= num1 && num3 <= num2) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            System.out.print(temp);
            num /= 10;
        }
        System.out.println("\nСумма цифр " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        while (count != 0 && count < 5) {
            System.out.printf("%4d", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        int countTwos = 0;
        System.out.print("В " + num);
        while (num > 0) {
            if (num % 10 == 2) {
                countTwos++;
            }
            num = num / 10;
        }
        if (countTwos % 2 == 0) {
            System.out.print(" четное");
        } else {
            System.out.print(" нечетное");
        }
        System.out.println(" (" + countTwos + ") количество двоек.");
    
        System.out.println("\n6. Вывод геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        int count2 = 5;
        while (count2 > 0) {
            for (int i = 0; i < count2; i++) {
                System.out.print("# ");
            }
            System.out.println();
            count2--;
        }
        System.out.println();
        
        int height = 3;
        int numberLines = 2 * height - 1;
        int countString = 1;
        int step = 1;
        int widthLine = 1;
        do {
            int countCurentString = 0;
            do {
                System.out.print("$");
            } while (++countCurentString < widthLine);
            System.out.println();
            if (countString == height) {
                step = -1;
            }
            widthLine += step;
        } while (++countString <= numberLines);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%10c             %-30s%n", i, (char) i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%10c             %-30s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int reverse = 0;
        int numCopy = num;
        while (numCopy > 0) {
            reverse *= 10;
            reverse += numCopy % 10;
            numCopy /= 10;
        }
        System.out.print("Число " + num);
        if (num == reverse) {
            System.out.println(" - палиндром");
        } else {
            System.out.println(" - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        num = 123321;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;
        int firstHalfCopy = firstHalf;
        int secondHalfCopy = secondHalf;
        int firstSum = 0;
        int secondSum = 0;
        while (firstHalfCopy > 0) {
            firstSum += firstHalfCopy % 10;
            firstHalfCopy /= 10;
            secondSum += secondHalfCopy % 10;
            secondHalfCopy /= 10;
        }
        System.out.print("Число " + num + " - ");
        if (firstSum == secondSum) {
            System.out.println("счастливое");
        } else {
            System.out.println("обычное");
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + firstSum);
        System.out.println("Сумма " + secondHalf + " = " + secondSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
                if (j == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i == 1) {
                System.out.println("-------------------------------------");
            }
        }
    }
}