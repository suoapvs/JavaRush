package com.javarush.test.level04.lesson06.task03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка трех чисел
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int[] result = sort(a, b, c);
        print(result);
    }

    private static int[] sort(final int... values) {
        Arrays.sort(values);
        return values;
    }

    private static void print(final int[] values) {
        final StringBuilder sb = new StringBuilder();
        for (int i = values.length - 1; i >= 0; i--) {
            sb.append(values[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}
