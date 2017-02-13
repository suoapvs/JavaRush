package com.javarush.test.level07.lesson06.task04;

/* 5 строчек в начало списка
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final List<String> list = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            list.add(0, scanner.nextLine());
        }
        for (String string : list)
        {
            System.out.println(string);
        }
    }
}
