package com.javarush.test.level05.lesson12.bonus03;

import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        int n;
        do
        {
            n = scanner.nextInt();
        }
        while (n <= 0);
        int maximum = 0;
        int temp;
        for (int i = 0; i < n; i++)
        {
            temp = scanner.nextInt();
            if (temp > maximum)
            {
                maximum = temp;
            }
        }
        System.out.println(maximum);
    }
}
