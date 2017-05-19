package com.javarush.test.level07.lesson09.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Удвой слова
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
 * 3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 10;
        final List<String> strings = scan(length);
        doubleValues(strings);
        println(strings);
    }

    public static List<String> doubleValues(final List<String> strings) {
        for (int i = 0; i < strings.size(); i += 2) {
            strings.add(i, strings.get(i));
        }
        return strings;
    }

    private static List<String> scan(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    private static void println(final List<String> list) {
        list.forEach(System.out::println);
    }
}
