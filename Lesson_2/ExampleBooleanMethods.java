public class ExampleBooleanMethods {
    public boolean isProgramContinue() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetter() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttempts() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isPathToFileValid() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExist() {
        System.out.print(ExampleStaticMethod.getNameThisMethod() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}