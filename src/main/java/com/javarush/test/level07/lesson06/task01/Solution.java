package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 различных строчек в списке
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строчек.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final List<String> strings = createRandom(length);
        printlnSize(strings);
        println(strings);
    }

    private static List<String> createRandom(final int length) {
        final List<String> strings = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            strings.add("String " + i);
        }
        return strings;
    }

    private static void printlnSize(final List<String> strings) {
        System.out.println(strings.size());
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
