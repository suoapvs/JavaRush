package com.javarush.test.level07.lesson12.home01;

import java.io.IOException;
import java.util.*;

/**
 * Вывести числа в обратном порядке
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке.
 * Использовать только цикл for.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final int length = 10;
        final List<Integer> integers = scan(length);
        sort(integers);
        printlnRevers(integers);
    }

    private static List<Integer> scan(final int length) {
        final List<Integer> integers = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            integers.add(scanner.nextInt());
        }
        return integers;
    }

    private static void sort(final List<Integer> integers) {
        Collections.sort(integers);
    }

    private static void printlnRevers(final List<Integer> integers) {
        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }
    }
}
