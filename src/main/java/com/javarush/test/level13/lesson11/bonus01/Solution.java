package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final String fileName = new Scanner(System.in).nextLine();
        final List<Integer> list = readFormFile(fileName);
        final List<Integer> evenNumbers = getEvenNumbers(list);
        Collections.sort(evenNumbers);
        println(evenNumbers);
    }

    private static List<Integer> readFormFile(final String fileName)
    {
        final List<Integer> list = new ArrayList<>();
        try (final BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line = reader.readLine();
            while (line != null)
            {
                list.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return list;
    }

    private static List<Integer> getEvenNumbers(final List<Integer> list)
    {
        final List<Integer> result = new ArrayList<>();
        for (int num : list)
        {
            if (num % 2 == 0)
            {
                result.add(num);
            }
        }
        return result;
    }

    private static void println(final List<Integer> list)
    {
        for (int num : list)
        {
            System.out.println(num);
        }
    }
}
