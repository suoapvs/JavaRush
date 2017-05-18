package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final String fileName = new Scanner(System.in).nextLine();
        final List<Integer> integerList = readFile(fileName);
        final Map<Integer, Integer> map = frequency(integerList);
        final int max = getMax(map);
        printMax(map, max);
    }

    private static List<Integer> readFile(final String fileName) throws IOException
    {
        final List<Integer> list = new ArrayList<>();
        try (final FileInputStream inputStream = new FileInputStream(fileName))
        {
            while (inputStream.available() > 0)
            {
                list.add(inputStream.read());
            }
        }
        return list;
    }

    private static Map<Integer, Integer> frequency(final List<Integer> list)
    {
        final Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list)
        {
            map.put(integer, Collections.frequency(list, integer));
        }
        return map;
    }

    private static int getMax(final Map<Integer, Integer> map)
    {
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
            }
        }
        return max;
    }

    private static void printMax(final Map<Integer, Integer> map, final int max)
    {
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue().equals(max))
            {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
