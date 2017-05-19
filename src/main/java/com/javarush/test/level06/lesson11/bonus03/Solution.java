package com.javarush.test.level06.lesson11.bonus03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача по алгоритмам
 * Задача: Написать программу, которая вводит с клавиатуры 5 чисел
 * и выводит их в возрастающем порядке.
 * Пример ввода:
 * 3
 * 2
 * 15
 * 6
 * 17
 * Пример вывода:
 * 2
 * 3
 * 6
 * 15
 * 17
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final int[] numbers = scan(length);
        sort(numbers);
        print(numbers);
    }

    private static int[] scan(final int length) {
        final int[] numbers = new int[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static void sort(final int[] numbers) {
        Arrays.sort(numbers);
    }

    private static void print(final int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
