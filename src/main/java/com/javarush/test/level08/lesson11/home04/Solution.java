package com.javarush.test.level08.lesson11.home04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Минимальное из N чисел
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final List<Integer> list = createList();
        final int min = getMinimum(list);
        System.out.println(min);
    }

    public static List<Integer> createList() {
        final Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        }
        while (n <= 0);
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static int getMinimum(final List<Integer> array) {
        int min = array.get(0);
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
