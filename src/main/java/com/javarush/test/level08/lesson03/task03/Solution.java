package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/**
 * Коллекция HashMap из котов
 * Есть класс Cat с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String[] cats = {
                "васька", "мурка", "дымка", "рыжик", "серый",
                "снежок", "босс", "борис", "визя", "гарфи"
        };
        final Map<String, Cat> catsMap = addCatsToMap(cats);
        println(catsMap);
    }

    private static HashMap<String, Cat> addCatsToMap(final String[] cats) {
        final HashMap<String, Cat> map = new HashMap<>();
        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        return map;
    }

    private static void println(final Map<String, Cat> cats) {
        for (Map.Entry<String, Cat> entry : cats.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static class Cat {
        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return (name != null) ? name.toUpperCase() : null;
        }
    }
}
