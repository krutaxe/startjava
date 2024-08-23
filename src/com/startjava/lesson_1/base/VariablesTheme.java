package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberCores = 6;
        short ramPc = 32;
        int frequencyCpu = 3600;
        long capacityHd = 512000;
        float psuPower = 2.450f;
        double sizeMonitor = 27.8;
        char energyEfficiencyClass = 'A';
        boolean isWork = true;
        System.out.println("Количество ядер - " + numberCores);
        System.out.println("Оперативная память - " + ram);
        System.out.println("Частота процессора - " + frequencyCpu);
        System.out.println("Объём жесткого диска - " + capacityHd);
        System.out.println("Мощность блока питания - " + psuPower);
        System.out.println("Размер монитора - " + sizeMonitor);
        System.out.println("Класс электропотребления - " + energyEfficiencyClass);
        System.out.println("В работе - " + isWork);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double pricePen = 105.5;
        double priceBook = 235.83;
        double discountPrice = (pricePen + priceBook) * 11 / 100;
        System.out.println("Стоимость ручки - " + pricePen + ", " + "Стоимость книги - " + priceBook);
        System.out.println("Сумма скидки - " + discountPrice);
        System.out.println("Стоимость товаров со скидкой - " + ((pricePen + priceBook) - discountPrice));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println("J   J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte extremesByteValue = 127;
        short extremesShortValue = 32767;
        int extremesIntValue = 2147483647;
        long extremesLongValue = 9223372036854775807L;
        char extremesCharValue = 65535;
        System.out.println("Byte");
        System.out.println("Первоначальное значение = " + extremesByteValue);
        System.out.println("Значение после инкремента на единицу = " + ++extremesByteValue);
        System.out.println("Значение после декремента на единицу = " + --extremesByteValue);
        System.out.println("\nShort");
        System.out.println("Первоначальное значение = " + extremesShortValue);
        System.out.println("Значение после инкремента на единицу = " + ++extremesShortValue);
        System.out.println("Значение после декремента на единицу = " + --extremesShortValue);
        System.out.println("\nInt");
        System.out.println("Первоначальное значение = " + extremesIntValue);
        System.out.println("Значение после инкремента на единицу = " + ++extremesIntValue);
        System.out.println("Значение после декремента на единицу = " + --extremesIntValue);
        System.out.println("\nLong");
        System.out.println("Первоначальное значение = " + extremesLongValue);
        System.out.println("Значение после инкремента на единицу = " + ++extremesLongValue);
        System.out.println("Значение после декремента на единицу = " + --extremesLongValue);
        System.out.println("\nChar");
        System.out.println("Первоначальное значение = " + (int) extremesCharValue);
        System.out.println("Значение после инкремента на единицу = " + (int) ++extremesCharValue);
        System.out.println("Значение после декремента на единицу = " + (int) --extremesCharValue);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходное значение num1 = " + num1 + ", " +
                "Исходное значение num2 = " + num2);
        System.out.println("\nС помощью третьей переменной");
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);
        System.out.println("\nС помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);
        System.out.println("\nС помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore +
                leftBracket + " " + rightBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore +
                     underscore + underscore + slash + backslash +
                     underscore + underscore + backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sumDigits = ones + tens + hundreds;
        int multiplicationDigits = ones * tens * hundreds;
        System.out.println("Число 123 содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + sumDigits);
        System.out.println("Произведение разрядов = " + multiplicationDigits);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int secondsAll = 86399;
        int hh = secondsAll / 360 % 24;
        int mm = secondsAll / 60 % 60;
        int ss = secondsAll % 60;
        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.println("\n10.* Расчет стоимости товара со скидкой");
        BigDecimal pricePen = new BigDecimal(105.5);
        BigDecimal priceBook = new BigDecimal(235.83).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPrice = pricePen.add(priceBook).multiply(BigDecimal.valueOf(11))
                .divide(BigDecimal.valueOf(100));
        System.out.println("Стоимость ручки - " + pricePen + ", " + "Стоимость книги - " + priceBook);
        System.out.println("Сумма скидки - " + discountPrice.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Стоимость товаров со скидкой - " +
                pricePen.add(priceBook).subtract(discountPrice).setScale(2, RoundingMode.HALF_UP));
    }
}
