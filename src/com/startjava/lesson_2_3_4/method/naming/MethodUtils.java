package com.startjava.lesson_2_3_4.method.naming;

public class MethodUtils {
    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}