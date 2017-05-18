package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();
        System.out.println(max(a, b, c, d));
    }

    private static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
