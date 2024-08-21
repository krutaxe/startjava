public class MethodUtils {
    public static String getNameThisMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}