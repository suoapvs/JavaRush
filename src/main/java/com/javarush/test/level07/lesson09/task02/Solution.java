package com.javarush.test.level07.lesson09.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5 слов в обратном порядке
 * Введи с клавиатуры 5 слов в список строк.
 * Выведи их в обратном порядке.
 */
public class Solution {

    public static void main(String[] args) {
        final int length = 5;
        final List<String> strings = scan(length);
        printRevers(strings);
    }

    private static List<String> scan(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    private static void printRevers(final List<String> strings) {
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}
