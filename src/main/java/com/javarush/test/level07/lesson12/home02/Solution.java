package com.javarush.test.level07.lesson12.home02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Переставить M первых строк в конец списка
 * Ввести с клавиатуры 2 числа N  и M.
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final List<String> strings = scan(n);
        swapFromHeadToTail(strings, m);
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

    private static void swapFromHeadToTail(final List<String> strings, final int swapNumber) {
        for (int i = 0; i < swapNumber; i++) {
            strings.add(strings.remove(0));
        }
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
