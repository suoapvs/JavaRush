package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Список из массивов чисел
 * Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 * Заполнить массивы любыми данными и вывести их на экран.
 */
public class Solution {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        final int[] lengths = { 5, 2, 4, 7, 0 };
        final List<int[]> list = createList(lengths);
        printList(list);
    }

    public static List<int[]> createList(final int[] lengths) {
        final List<int[]> list = new ArrayList<>();
        int[] array;
        for (int length : lengths) {
            array = createRandomArray(length);
            list.add(array);
        }
        return list;
    }

    private static int[] createRandomArray(final int length) {
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = RANDOM.nextInt();
        }
        return array;
    }

    public static void printList(final List<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
