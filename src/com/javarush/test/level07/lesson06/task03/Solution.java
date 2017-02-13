package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Collections;
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
            list.add(scanner.nextLine());
        }
        Collections.reverse(list);
        for (String string : list)
        {
            System.out.println(string);
        }
    }
}
