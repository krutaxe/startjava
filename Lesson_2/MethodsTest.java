public class MethodsTest {
    public static void main(String[] args) {
        MethodsTest test = new MethodsTest();
        test.executeMethods();
        System.out.println();
        test.executeBooleanMethods();
    }

    private void executeMethods() {
        ExampleMethods em = new ExampleMethods();
        em.findLongestWord();
        em.selectMenuItem();
        em.calcAvgGrades();
        em.countUniqueWords();
        em.displayErrorMessage();
        em.syncDataCloud();
        em.restoreData();
        em.pauseDownload();
        em.resetFactorySetting();
        em.writeToFile();
        em.converToFahrenheit();
        em.enterMathExpression();
        em.identifyWinner();
        em.findBookByAuthor();
    }

    private void executeBooleanMethods() {
        ExampleBooleanMethods ebm = new ExampleBooleanMethods();
        System.out.println(ebm.isProgramContinue());
        System.out.println(ebm.isFileDeleted());
        System.out.println(ebm.hasUniqueDigit());
        System.out.println(ebm.isLetter());
        System.out.println(ebm.hasEqualDigits());
        System.out.println(ebm.hasAttempts());
        System.out.println(ebm.isEmptyString());
        System.out.println(ebm.isEvenNumber());
        System.out.println(ebm.isPathToFileValid());
        System.out.println(ebm.isFileExist());
    }
}