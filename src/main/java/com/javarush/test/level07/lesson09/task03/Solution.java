package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * Слово «именно»
 * 1. Создай список из слов «мама», «мыла», «раму».
 * 2. После каждого слова вставь в список строку, содержащую слово «именно».
 * 3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final List<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        final String input = "именно";
        modify(strings, input);
        println(strings);
    }

    private static void modify(final List<String> strings, final String input) {
        for (int i = 1; i < strings.size(); i += 2) {
            strings.add(i, input);
        }
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
