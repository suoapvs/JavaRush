package com.javarush.test.level07.lesson12.bonus03;

import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final int[] array = new int[20];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
        {
            array[i] = scanner.nextInt();
        }
        sort(array);
        for (int i : array)
        {
            System.out.println(i);
        }
    }

    public static void sort(int[] array)
    {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
