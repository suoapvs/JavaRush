package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        final Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Herov", "Her");
        map.put("Dul'kin", "Dula");
        map.put("Petin", "Afanasiy");
        map.put("Sidorov", "Semen");
        map.put("Pen", "Semen");
        map.put("Nosin", "Napoleon");
        map.put("PUtin", "Semen");
        map.put("Cherezzabornogyzaderi", "Petr");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            if (entry.getValue().equals(name))
            {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastname)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            if (entry.getKey().equals(lastname))
            {
                count++;
            }
        }
        return count;
    }
}
