package com.javarush.test.level07.lesson12.home01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final List<Integer> list = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            list.add(scanner.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
