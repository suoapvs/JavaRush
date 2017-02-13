package com.javarush.test.level07.lesson04.task01;

import java.util.Scanner;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray()
    {
        final int[] array = new int[20];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int max(final int[] array)
    {
        int max = 0;
        for (int value : array)
        {
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }
}
