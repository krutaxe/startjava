public class ExampleBooleanMethods {
    public boolean isProgramContinue() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> последовательность содержит уникальную цифру");
        return false;
    }

    public boolean isLetter() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasAttempts() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isEmptyString() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isPathToFileValid() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(ExampleStaticMethod.getNameThisMethod() +
                "() -> файл по указанному адресу существует?");
        return false;
    }
}