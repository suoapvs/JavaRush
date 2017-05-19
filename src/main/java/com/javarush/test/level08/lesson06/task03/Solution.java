package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Измерить сколько времени занимает 10 тысяч вставок для каждого списка
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList<>()));
        System.out.println(getTimeMsOfInsert(new LinkedList<>()));
    }

    public static long getTimeMsOfInsert(List<Object> list) {
        final long start = System.currentTimeMillis();
        insert10000(list);
        final long end = System.currentTimeMillis();
        return (end - start);
    }

    public static void insert10000(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
