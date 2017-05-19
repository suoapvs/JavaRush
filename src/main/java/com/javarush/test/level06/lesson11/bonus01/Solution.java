package com.javarush.test.level06.lesson11.bonus01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Нужно исправить программу, чтобы компилировалась и работала
 * Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        System.out.println("Max is " + max(a, b));
    }

    private static int max(final int a, final int b) {
        return (a > b ? a : b);
    }
}
