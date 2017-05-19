package com.javarush.test.level09.lesson02.task03;

/**
 * Метод должен вернуть номер строки кода, из которого вызвали этот метод
 * Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода,
 * из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    public static int method1() {
        method2();
        return getLineNumber(3);
    }

    public static int method2() {
        method3();
        return getLineNumber(3);
    }

    public static int method3() {
        method4();
        return getLineNumber(3);
    }

    public static int method4() {
        method5();
        return getLineNumber(3);
    }

    public static int method5() {
        return getLineNumber(3);
    }

    private static int getLineNumber(final int number) {
        return Thread.currentThread().getStackTrace()[number].getLineNumber();
    }
}
