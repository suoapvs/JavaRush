package com.javarush.test.level07.lesson09.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final List<String> list = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }
        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
