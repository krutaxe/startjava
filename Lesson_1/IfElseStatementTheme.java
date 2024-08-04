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
            System.out.println(num1 + " больше " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " больше " + num1);
        } else {
            System.out.println(num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Проверка числа");
        int number = -5;
        if (number == 0) {
            System.out.println("Число является нулём");
        } else if (number % 2 == 0) {
            System.out.print("Число " + number + " является четным");
        } else {
            System.out.print("Число " + number + " является не четным");
        }
        if (number > 0) {
            System.out.println(" и положительным");
        } else {
            System.out.println(" и отрицательным");
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
        if (!(hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2)) {
            System.out.println("Одинаковых цифр в равных разрядах нет!");
        } else {
            System.out.println("\nИсходные числа " + number1 + " и " + number2);
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковые цифры " + hundreds1);
                System.out.println("Номер разряда " + 3);
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковые цифры " + tens1);
                System.out.println("Номер разряда " + 2);
            }
            if (ones1 == ones2) {
                System.out.println("Одинаковые цифры " + ones1);
                System.out.println("Номер разряда " + 1);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0035';
        if (ch >= '1' && ch <= '9') {
            System.out.println(ch + " - цифра");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " - большая буква");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " - маленькая буква");
        } else {
            System.out.println(ch + " ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double accaunt = 321123.59;
        int rate = 10;
        if (accaunt < 100000) {
            rate = 5;
        } else if (accaunt >= 100000 && accaunt <= 300000) {
            rate = 7;
        } 
        System.out.println("Сумма вклада = " + accaunt);
        System.out.println("Сумма начисленного % = " + accaunt * rate / 100);
        System.out.println("Итоговая сумма = " + (accaunt + (accaunt * rate / 100)));

        System.out.println("\n7.Определение оценки по предметам");
        int percentageHistory = 59;
        int gradeHistory = 2;
        if (percentageHistory > 91) {
            gradeHistory = 5;
        } else if (percentageHistory > 73) {
            gradeHistory = 4;
        } else if (percentageHistory > 60) {
            gradeHistory = 3;
        }
        int percentageProgramming = 92;
        int gradeProgramming = 2;
        if (percentageProgramming > 91) {
            gradeProgramming = 5;
        } else if (percentageProgramming > 73) {
            gradeProgramming = 4;
        } else if (percentageProgramming > 60) {
            gradeProgramming = 3;
        }
        System.out.println("История - " + gradeHistory);
        System.out.println("Программирование - " + gradeProgramming);
        System.out.println("Средний бал по предметам " + (double) (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний процент по предметам " +
                (double) (percentageHistory + percentageProgramming) / 2);

        System.out.println("\n8.Расчет годовой прибыли");
        double sales = 13025.233;
        double rent = 5123.018;
        double costProduction = 9001.729;
        double profitYear = (sales - rent - costProduction) * 12;
        System.out.print("Прибыль за год: ");
        if (profitYear > 0) {
            System.out.print("+" + profitYear);
        } else {
            System.out.print(profitYear);
        }
        System.out.println("руб.");
    }
}