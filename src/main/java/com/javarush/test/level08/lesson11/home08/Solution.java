package com.javarush.test.level08.lesson11.home08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Пять наибольших чисел
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Вывести пять наибольших чисел.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final int maxLength = 6;
        final int[] array = scan(length);
        sort(array);
        printlnLast(array, maxLength);
    }

    private static int[] scan(final int length) {
        final int[] array = new int[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    private static void printlnLast(final int[] array, final int length) {
        for (int i = array.length - 1; i > array.length - length; i--) {
            System.out.println(array[i]);
        }
    }
}
