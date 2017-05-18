package com.javarush.test.level10.lesson11.home09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            words.add(scanner.nextLine());
        }
        final Map<String, Integer> map = countWords(words);
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        final Map<String, Integer> result = new HashMap<>();
        for (String line : list)
        {
            result.put(line, 0);
        }
        int count;
        String line;
        for (Map.Entry<String, Integer> entry : result.entrySet())
        {
            count = 0;
            line = entry.getKey();
            for (String line2 : list)
            {
                if (line.equals(line2))
                {
                    count++;
                }
            }
            result.put(line, count);
        }
        return result;
    }
}
