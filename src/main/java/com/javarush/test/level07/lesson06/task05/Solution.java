package com.javarush.test.level07.lesson06.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Удали последнюю строку и вставь её в начало
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final int swapNumber = 13;
        final List<String> strings = scan(length);
        swapHeadAndTail(strings, swapNumber);
        println(strings);
    }

    private static List<String> scan(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    private static void swapHeadAndTail(final List<String> strings, final int swapNumber) {
        for (int i = 0; i < swapNumber; i++) {
            swapHeadAndTail(strings);
        }
    }

    private static void swapHeadAndTail(final List<String> strings) {
        final int tempSize = strings.size() - 1;
        final String tempString = strings.get(tempSize);
        strings.remove(tempSize);
        strings.add(0, tempString);
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
