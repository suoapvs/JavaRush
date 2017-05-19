package com.javarush.test.level04.lesson10.task03;

import java.util.Scanner;

/**
 * Хорошего не бывает много
 * Ввести с клавиатуры строку и число N.
 * Вывести на экран строку N раз используя цикл while.
 * Пример ввода:
 * абв
 * 2
 * Пример вывода:
 * абв
 * абв
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final int number = scanner.nextInt();
        println(line, number);
    }

    private static void println(final String line, final int number) {
        int count = 0;
        while (count++ < number) {
            System.out.println(line);
        }
    }
}
