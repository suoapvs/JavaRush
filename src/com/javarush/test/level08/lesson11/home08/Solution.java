package com.javarush.test.level08.lesson11.home08;

import java.util.Arrays;
import java.util.Scanner;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        sort(array);
        for (int i = array.length - 1; i > array.length - 6; i--) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }
}
