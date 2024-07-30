public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberCores = 6;
        short memory = 32;
        int frequency = 3600;
        long capacityHardDisk = 512000;
        float powerPupplyPower = 2.450f;
        double sizeMonitor = 27.8;
        char energyEfficiencyClass = 'A';
        boolean isWork = true;
        System.out.println("Колличество ядер - " + numberCores);
        System.out.println("Оперативная память - " + memory);
        System.out.println("Частота процессора - " + frequency);
        System.out.println("Объём жесткого диска - " + capacityHardDisk);
        System.out.println("Мощность блока питания - " + powerPupplyPower);
        System.out.println("Рамер монитора - " + sizeMonitor);
        System.out.println("Класс элетропотребления - " + energyEfficiencyClass);
        System.out.println("В работе - " + isWork);
        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой");
        double pricePen = 105.5;
        double priceBook = 235.83;
        double discount = (pricePen + priceBook) * 11 / 100;
        System.out.println("Стоимость ручки - " + pricePen + ", " + "Стоимость книги - " + priceBook);
        System.out.println("Сумма скидки - " + discount);
        System.out.println("Стоимость товаров со скидкой - " + ((pricePen + priceBook) - discount));
        System.out.println();

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println("J   J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        byte byteMaxInc = ++byteMax;
        byte byteMaxDec = --byteMax;
        short shortMax = 32767;
        short shortMaxInc = ++shortMax;
        short shortMaxDec = --shortMax;
        int intMax = 2147483647;
        int intMaxInc = ++intMax;
        int intMaxDec = --intMax;
        long longMax = 9223372036854775807L;
        long longMaxInc = ++longMax;
        long longMaxDec = --longMax;
        System.out.println("Byte max = " + byteMax + ", " + "Byte max + 1 = " + byteMaxInc + ", " +
                "Byte max - 1 = " + byteMaxDec);
        System.out.println("Short max = " + shortMax + ", " + "Short max + 1 = " + shortMaxInc + ", " +
                "Short max - 1 = " + shortMaxDec);
        System.out.println("Int max = " + intMax + ", " + "Int max + 1 = " + intMaxInc + ", " +
                "Int max - 1 = " + intMaxDec);
        System.out.println("Long max = " + longMax + ", " + "Long max + 1 = " + longMaxInc + ", " +
                "Long max - 1 = " + longMaxDec);
        System.out.println();

        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int temp;
        System.out.println("Исходное значение num1 = " + num1 + ", " + "Исходное значение num2 = " + num2);
        System.out.println("С помощью третьей переменной");
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);
        System.out.println();

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("36" + " - " + dollar);
        System.out.println("42" + " - " + asterisk);
        System.out.println("64" + " - " + atSign);
        System.out.println("124" + " - " + verticalBar);
        System.out.println("126" + " - " + tilde);
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = 92;
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + slash + "" + backslash + "    ");
        System.out.println("   " + slash + "  " + backslash + "   ");
        System.out.println("  " + slash + "" + underscore + "" + leftBracket + " " + rightBracket +
                "" + backslash);
        System.out.println(" " + slash + "      " + backslash + " ");
        System.out.println("" + slash + "" + underscore + "" + underscore + "" + underscore +
                "" + underscore + "" + slash + "" + backslash + "" + underscore + "" +
                "" + underscore + backslash);
        System.out.println();

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sumDigits = units + tens + hundreds;
        int multiplicationDigits = units * tens * hundreds;
        System.out.println("Число 123 содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма разрядов = " + sumDigits);
        System.out.println("Произведение разрядов = " + multiplicationDigits);
        System.out.println();

        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int secondsAll = 86399;
        int hour = secondsAll / 360 % 24;
        int minuts = secondsAll % 60;
        int seconds = secondsAll / 360 % 60;
        System.out.println(hour + ":" + minuts + ":" + seconds);
    }
}