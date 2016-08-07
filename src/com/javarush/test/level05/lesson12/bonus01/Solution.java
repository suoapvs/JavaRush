package com.javarush.test.level05.lesson12.bonus01;

import java.util.Scanner;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
