package com.javarush.test.level05.lesson12.bonus03;

import java.util.Scanner;

/**
 * Задача по алгоритмам
 * Написать программу, которая:
 * 1. вводит с консоли число N > 0
 * 2. потом вводит N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        } while (n <= 0);
        final int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(max(numbers));
    }

    private static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
