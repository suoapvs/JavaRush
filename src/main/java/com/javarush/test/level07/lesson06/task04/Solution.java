package com.javarush.test.level07.lesson06.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5 строчек в начало списка
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final List<String> strings = scanInHead(length);
        println(strings);
    }

    private static List<String> scanInHead(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(0, scanner.nextLine());
        }
        return strings;
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
