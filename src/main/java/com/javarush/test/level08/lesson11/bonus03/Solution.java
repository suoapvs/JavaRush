package com.javarush.test.level08.lesson11.bonus03;

import java.util.Arrays;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextLine();
        }
        sort(array);
        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        Arrays.sort(array);
    }

    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
