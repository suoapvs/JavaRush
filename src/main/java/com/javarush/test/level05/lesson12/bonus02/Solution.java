package com.javarush.test.level05.lesson12.bonus02;

import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int result = min(min(min(a, b), c), min(d, e));
        System.out.println("Minimum = " + result);
    }

    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
