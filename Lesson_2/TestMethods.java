public class TestMethods {
    private ExampleMethods em;
    private ExampleBooleanMethods ebm;

    public TestMethods(ExampleMethods em, ExampleBooleanMethods ebm) {
        this.em = em;
        this.ebm = ebm;
    }

    public void executeMethods() {
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

    public void executeBooleanMethods() {
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

    public static void main(String[] args) {
        ExampleMethods em = new ExampleMethods();
        ExampleBooleanMethods ebm = new ExampleBooleanMethods();
        TestMethods test = new TestMethods(em, ebm);
        test.executeMethods();
        System.out.println();
        test.executeBooleanMethods();
    }
}