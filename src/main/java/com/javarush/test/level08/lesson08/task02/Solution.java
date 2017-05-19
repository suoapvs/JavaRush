package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Random;

/**
 * Удалить все числа больше 10
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 */
public class Solution {

    public static void main(String[] args) {
        HashSet<Integer> integers = createSet();
        removeAllNumbersMoreThen10(integers);
    }

    public static HashSet<Integer> createSet() {
        final HashSet<Integer> set = new HashSet<>();
        final Random random = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt());
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(final HashSet<Integer> set) {
        final HashSet<Integer> temp = new HashSet<>(set);
        temp.stream()
                .filter(value -> (value > 10))
                .forEach(set::remove);
        return set;
    }
}
