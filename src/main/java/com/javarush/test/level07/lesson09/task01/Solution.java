package com.javarush.test.level07.lesson09.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Три массива
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * 2. Метод printList должен выводить на экран все элементы списка  с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран.
 * Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final List<Integer> integers = scan(length);
        final List<Integer> dividedIntoThree = getByDivide(integers, 3);
        final List<Integer> dividedIntoTwo = getByDivide(integers, 2);
        final List<Integer> other = new ArrayList<>(integers);
        other.removeAll(dividedIntoThree);
        other.removeAll(dividedIntoTwo);
        printList(dividedIntoThree);
        printList(dividedIntoTwo);
        printList(other);
    }

    private static List<Integer> scan(final int length) {
        final List<Integer> integers = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            integers.add(scanner.nextInt());
        }
        return integers;
    }

    private static List<Integer> getByDivide(final List<Integer> integers, final int divideValue) {
        return integers.stream()
                .filter(i -> (i % divideValue == 0))
                .collect(Collectors.toList());
    }

    private static void printList(final List<Integer> list) {
        list.forEach(System.out::println);
    }
}
