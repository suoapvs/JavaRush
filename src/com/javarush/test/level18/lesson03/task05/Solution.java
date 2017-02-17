package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.TreeSet;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final String fileName = new Scanner(System.in).nextLine();
        try (final FileInputStream inputStream = new FileInputStream(fileName))
        {
            final TreeSet<Integer> set = new TreeSet<>();
            while (inputStream.available() > 0)
            {
                set.add(inputStream.read());
            }
            for (int i : set)
            {
                System.out.print(i + " ");
            }
        }
    }
}

