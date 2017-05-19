package com.javarush.test.level08.lesson11.bonus03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача по алгоритмам
 * Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final String[] array = scan(length);
        sort(array);
        println(array);
    }

    private static String[] scan(final int length) {
        final String[] array = new String[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextLine();
        }
        return array;
    }

    private static void sort(String[] array) {
        Arrays.sort(array);
    }

    private static void println(final String[] array) {
        for (String x : array) {
            System.out.println(x);
        }
    }
}
