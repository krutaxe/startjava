public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        char sex = 'M';
        if (sex != 'M') {
            System.out.println("Пол не мужской");
        } else {
            System.out.println("Пол мужской");
        }

        int age = 37;
        if (age > 18) {
            System.out.println("Возраст больше 18");
        } else {
            System.out.println("Возраст не больше 18");
        }

        double height = 1.73;
        if (height < 1.8) {
            System.out.println("Рост меньше 1.8");
        } else {
            System.out.println("Рост не меньше 1.8");
        }

        char firstLetterName = "Dima".charAt(0);
        if (firstLetterName == 'D') {
            System.out.println("Первая буква имени D");
        } else if (firstLetterName == 'M') {
            System.out.println("Первая буква имени M");
        } else {
            System.out.println("Первая буква имени не D и не M");
        }

        System.out.println("\n2. Поиск большего числа");
        int num1 = 100;
        int num2 = 500;
        if (num1 > num2) {
            System.out.println("num1 больше num2");
        } else if (num1 < num2) {
            System.out.println("num2 больше num1");
        } else {
            System.out.println("num1 и num2 равны");
        }

        System.out.println("\n3. Проверка числа");
        int number = -5;
        if (number == 0) {
            System.out.println(number + " является нулём");
        } else if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("Число " + number + " является четным и положительным");
            } else {
                System.out.println("Число " + number + " является четным и отрицательным");
            }
        } else {
            if (number > 0) {
                System.out.println("Число " + number + " является не четным и положительным");
            } else {
                System.out.println("Число " + number + " является не четным и отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int ones1 = number1 % 10;
        int tens1 = number1 / 10 % 10;
        int hundreds1 = number1 / 100;
        int ones2 = number2 % 10;
        int tens2 = number2 / 10 % 10;
        int hundreds2 = number2 / 100;
        if (!(hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2 )) {
            System.out.println("Одинаковых цифр в равных разрядах нет!");
        } else {
            if (hundreds1 == hundreds2) {
                System.out.println("\nИсходные числа " + number1 + " и " + number2);
                System.out.println("Одинаковые цыфры " + hundreds1);
                System.out.println("Номер зазряда " + 3);
            };
            if (tens1 == tens2) {
                System.out.println("\nИсходные числа " + number1 + " и " + number2);
                System.out.println("Одинаковые цыфры " + tens1);
                System.out.println("Номер зазряда " + 2);
             };
            if (ones1 == ones2) {
                System.out.println("\nИсходные числа " + number1 + " и " + number2);
                System.out.println("Одинаковые цыфры " + ones1);
                System.out.println("Номер зазряда " + 1);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';
        System.out.println((int)ch);

        System.out.println("\n6. Подсчет начисленных банком %");
        double accaunt = 321123.59;
        if (accaunt < 100000) {
            System.out.println("Сумма вклада = " + accaunt);
            System.out.println("Сумма начисленного % = " + accaunt * 5 / 100);
            System.out.println("Итоговая сумма = " + (accaunt + (accaunt * 5 / 100)));
        } else if (100000 <= accaunt && accaunt <= 300000) {
            System.out.println("Сумма вклада = " + accaunt);
            System.out.println("Сумма начисленного % = " + accaunt * 7 / 100);
            System.out.println("Итоговая сумма = " + (accaunt + (accaunt * 7 / 100)));
        } else {
            System.out.println("Сумма вклада = " + accaunt);
            System.out.println("Сумма начисленного % = " + accaunt * 10 / 100);
            System.out.println("Итоговая сумма = " + (accaunt + (accaunt * 10 / 100)));
        }

        System.out.println("\n7.Определение оценки по предметам");
        int percentageHistory = 59;
        int percentageProgramming = 92;
        int gradeHistory;
        int gradeProgramming;
        if (percentageHistory > 91) {
            gradeHistory = 5;
        } else if (percentageHistory > 73) {
            gradeHistory = 4;
        } else if (percentageHistory > 60) {
            gradeHistory = 3;
        } else {
            gradeHistory = 2;
        };

        if (percentageProgramming > 91) {
            gradeProgramming = 5;
        } else if (percentageProgramming > 73) {
            gradeProgramming = 4;
        } else if (percentageProgramming > 60) {
            gradeProgramming = 3;
        } else {
            gradeProgramming = 2;
        };
        System.out.println("История - " + gradeHistory);
        System.out.println("Программирование - " + gradeProgramming);
        System.out.println("Средний бал по предметам " + (double) (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний процент по предметам " + (double) (percentageHistory + percentageProgramming) / 2);

        System.out.println("\n8.Расчет годовой прибыли");
        double sales = 13025.233;
        double arenda = 5123.018;
        double costProduction = 9001.729;
        double profitYear = (sales - arenda - costProduction) * 12;
        System.out.println("Прибыль за год: " + profitYear + "руб.");
    }
}