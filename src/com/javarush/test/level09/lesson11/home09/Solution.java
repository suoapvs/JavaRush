package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static class Cat
    {
        private String name;

        public Cat(final String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }
    }

    public static void main(String[] args)
    {
        printCatSet(
                convertMapToSet(
                        createMap()
                )
        );
    }

    public static Map<String, Cat> createMap()
    {
        final Map<String, Cat> cats = new HashMap<>();
        Cat cat;
        for (int i = 0; i < 10; i++)
        {
            cat = new Cat("Cat #" + i);
            cats.put(cat.getName(), cat);
        }
        return cats;
    }

    public static Set<Cat> convertMapToSet(final Map<String, Cat> map)
    {
        final Set<Cat> cats = new HashSet<>();
        for (Cat cat : map.values())
        {
            cats.add(cat);
        }
        return cats;
    }

    public static void printCatSet(final Set<Cat> set)
    {
        for (Cat cat : set)
        {
            System.out.println(cat);
        }
    }
}
