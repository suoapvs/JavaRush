package com.javarush.test.level07.lesson12.home03;

import java.io.IOException;
import java.util.Scanner;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final int[] array = new int[20];
        int max = 0;
        int min = 0;
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
            if (array[i] > max)
            {
                max = array[i];
            }
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
