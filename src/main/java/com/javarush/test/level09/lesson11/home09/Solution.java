package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Десять котов
 * Создать класс кот – Cat, с полем «имя» (String).
 * Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
 * Получить из Map множество(Set) всех имен и вывести его на экран.
 */
public class Solution {

    public static class Cat {
        private final String name;

        public Cat(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat " + this.name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        final int catsNumber = 10;
        final Map<String, Cat> cats = createMap(catsNumber);
        final Set<String> catNames = cats.keySet();
        printCatSet(catNames);
    }

    public static Map<String, Cat> createMap(final int catsNumber) {
        final Map<String, Cat> cats = new HashMap<>();
        Cat cat;
        for (int i = 0; i < catsNumber; i++) {
            cat = new Cat("Cat #" + i);
            cats.put(cat.getName(), cat);
        }
        return cats;
    }

    public static void printCatSet(final Set<String> set) {
        set.forEach(System.out::println);
    }
}
