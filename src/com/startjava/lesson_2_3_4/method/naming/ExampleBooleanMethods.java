package com.startjava.lesson_2_3_4.method.naming;

public class ExampleBooleanMethods {
    public boolean isProgramContinue() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetter() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttempts() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isPathToFileValid() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExist() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}