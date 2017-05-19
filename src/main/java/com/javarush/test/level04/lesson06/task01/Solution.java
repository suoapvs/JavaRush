package com.javarush.test.level04.lesson06.task01;

import java.util.Scanner;

/**
 * Минимум двух чисел
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        System.out.println(min(a, b));
    }

    private static int min(final int a, final int b) {
        return (a < b ? a : b);
    }
}