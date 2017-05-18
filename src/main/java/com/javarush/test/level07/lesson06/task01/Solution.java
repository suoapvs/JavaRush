package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            list.add("String " + i);
        }
        System.out.println(list.size());
        for (String string : list)
        {
            System.out.println(string);
        }
    }
}
