package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Массив списков строк
 * Создать массив, элементами которого будут списки строк.
 * Заполнить массив любыми данными и вывести их на экран.
 */

public class Solution {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        final int length = 10;
        final int listSize = 100;
        final List<String>[] lists = createListArray(length, listSize);
        printLists(lists);
    }

    public static List<String>[] createListArray(final int length, final int listSize) {
        final List<String>[] list = new List[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = createRandomList(listSize);
        }
        return list;
    }

    private static List<String> createRandomList(final int listSize) {
        final List<String> list= new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add("" + RANDOM.nextInt());
        }
        return list;
    }

    public static void printLists(final List<String>[] arrayOfStringList) {
        for (List<String> list : arrayOfStringList) {
            list.forEach(System.out::println);
        }
    }
}