public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int x = 0;
        int y = 0;
        int number = start;
        do {
            if (number % 2 == 0) {
                x += number;
            } else {
                y += number;
            }
            number++;
        } while (number <= end);
        System.out.println("В отрезке [" + start + ", " + end + 
                "] сумма четных чисел = " + x + ", а нечетных = " + y);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        // Тут совсем не понял как сделать. 
        int a = 10;
        int b = 5;
        int c = -1;
        int max;
        int min;
        int middle;
        if (a > b && a > c) {
            max = a;
        } 
        
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number2 = 1234;
        int sum = 0;
        while (number2 > 0) {
            sum += number2 % 10;
            System.out.print(number2 % 10);
            number2 = number2 / 10;
        }
        System.out.println("\nСумма цифр " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                counter++;
                if (counter == 5) {
                    System.out.println();
                    counter = 0;
                }
            }
        }
        while (counter != 0 && counter < 5) {
            System.out.printf("%4d", 0);
            counter++;
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int num = 3242592;
        int count = 0;
        System.out.print("В " + num);
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num = num / 10;
        }
        if (count % 2 == 0) {
            System.out.print(" четное");
        } else {
            System.out.print(" нечетное");
        }
        System.out.println(" (" + count + ") количество двоек");
    
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
        int q = 5;
        do {
            for (int i = 0; i < q; i++) {
                System.out.print("$ ");
            }
            q--;
            System.out.println();
        } while (q > 0);
        // Куда прикрутить второй do while не додумался

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                // Когда пытаюсь стринг выровнить по левому краю и ставлю %-30s, все слипается,
                // с центральным столбцом.
                System.out.printf("%4d%10c%30s%n", i, (char) i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%10c%30s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number3 = 1234321;
        int revert = 0;
        int copyNumber3 = number3;
        while (copyNumber3 > 0) {
            revert += copyNumber3 % 10;
            copyNumber3 = copyNumber3 / 10;
            if (copyNumber3 > 0) {
                revert *= 10;
            }
        }
        System.out.print("Число " + number3);
        if (number3 == revert) {
            System.out.println(" - палиндром");
        } else {
            System.out.println(" - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number4 = 123321;
        int ones = number4 % 10;
        int tens = number4 / 10 % 10;
        int hundreds = number4 / 100 % 10;
        int thousands = number4 / 1000 % 10;
        int tenThousand = number4 / 10000 % 10;
        int hundredThousand = number4 / 100000;
        System.out.print("Число " + number4 + " - ");
        if ((ones + tens + hundreds) == (thousands + tenThousand + hundredThousand)) {
            System.out.println("счастливое");
        } else {
            System.out.println("обычное");
        }
        System.out.println("Сумма цифр " + hundredThousand + tenThousand + thousands + 
                " = " + (hundredThousand + tenThousand + thousands));
        System.out.println("Сумма " + hundreds + tens + ones + " = " +
                (hundreds + tens + ones));

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