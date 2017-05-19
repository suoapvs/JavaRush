package com.javarush.test.level07.lesson06.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 5 строчек в обратном порядке
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в него.
 * 3. Расположи их в обратном порядке.
 * 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final List<String> list = scan(length);
        Collections.reverse(list);
        println(list);
    }

    private static List<String> scan(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
