package com.javarush.test.level09.lesson02.task02;

/**
 * И снова StackTrace
 * Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
 * вызвавшего его, полученное с помощью StackTrace.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    public static String method1() {
        method2();
        return printAndGetParentMethodName();
    }

    public static String method2() {
        method3();
        return printAndGetParentMethodName();
    }

    public static String method3() {
        method4();
        return printAndGetParentMethodName();
    }

    public static String method4() {
        method5();
        return printAndGetParentMethodName();
    }

    public static String method5() {
        return printAndGetParentMethodName();
    }

    private static String printAndGetParentMethodName() {
        final String name = getParentMethodName();
        System.out.println(name);
        return name;
    }

    private static String getParentMethodName() {
        final StackTraceElement[] stackTraceElements = getStackTrace();
        return stackTraceElements[4].getMethodName();
    }

    private static StackTraceElement[] getStackTrace() {
        return Thread.currentThread().getStackTrace();
    }
}
