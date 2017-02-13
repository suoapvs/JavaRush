package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    private static final String[] NAMES = {"Alex", "Petr", "Anna", "Yurii", "Oksana"};
    private static final String[] SURNAMES = {"Petrovski", "Smith", "Irma", "Favn", "Qvair"};

    public static void main(String[] args)
    {
        printPeopleList(
                createPeopleList()
        );
    }

    public static Map<String, String> createPeopleList()
    {
        final Map<String, String> people = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            people.put(
                    getRandomLine(NAMES),
                    getRandomLine(SURNAMES)
            );
        }
        return people;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static String getRandomLine(String[] lines)
    {
        final Random random = new Random();
        int index = random.nextInt(lines.length);
        return lines[index];
    }
}
