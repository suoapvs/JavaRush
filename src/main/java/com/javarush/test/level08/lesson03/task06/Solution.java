package com.javarush.test.level08.lesson03.task06;

import java.util.HashMap;
import java.util.Map;

/**
 * Коллекция HashMap из Object
 * Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Пример вывода (тут показана только одна строка):
 * Sim - 5
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", (long) 56);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        println(map);
    }

    private static void println(final Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
