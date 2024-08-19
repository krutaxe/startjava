public class ExampleStaticMethod {
    public static String getNameThisMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}