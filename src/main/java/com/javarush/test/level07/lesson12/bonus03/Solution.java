package com.javarush.test.level07.lesson12.bonus03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача по алгоритмам
 * Задача: Написать программу, которая вводит с клавиатуры 20 чисел
 * и выводит их в убывающем порядке.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final int[] array = scan(length);
        sort(array);
        printlnRevers(array);
    }

    private static int[] scan(final int length) {
        final int[] array = new int[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void sort(final int[] array) {
        Arrays.sort(array);
    }

    private static void printlnRevers(final int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
