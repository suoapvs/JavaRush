package com.javarush.test.level08.lesson06.task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
 * Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
 * Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList<>())));
    }

    private static List fill(final List<Object> list) {
        for (int i = 0; i < 11; i++) {
            list.add(new Object());
        }
        return list;
    }

    private static long getTimeMsOfGet(final List<Object> list) {
        final long start = System.currentTimeMillis();
        get10000(list);
        final long end = System.currentTimeMillis();
        return (end - start);

    }

    private static void get10000(final List<Object> list) {
        if (!list.isEmpty()) {
            int index = list.size() / 2;
            for (int i = 0; i < 10000; i++) {
                list.get(index);
            }
        }
    }
}
