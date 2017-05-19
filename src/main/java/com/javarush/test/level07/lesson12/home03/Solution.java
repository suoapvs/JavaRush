package com.javarush.test.level07.lesson12.home03;

import java.io.IOException;
import java.util.Scanner;

/**
 * Максимальное и минимальное числа в массиве
 * Создать массив на 20 чисел. Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final int length = 20;
        final int[] integers = scan(length);
        final int max = max(integers);
        final int min = min(integers);
        System.out.println(max);
        System.out.println(min);
    }

    private static int[] scan(final int length) {
        final int[] integers = new int[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    private static int min(final int[] integers) {
        int min = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }
        return min;
    }

    private static int max(final int[] integers) {
        int max = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        return max;
    }
}
