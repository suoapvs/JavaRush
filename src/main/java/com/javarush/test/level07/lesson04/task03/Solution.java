package com.javarush.test.level07.lesson04.task03;

import java.util.Scanner;

/**
 * 2 массива
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String[] strings = scan(10);
        final Integer[] lengths = calcLength(strings);
        println(lengths);
    }

    private static String[] scan(final int length) {
        final String[] strings = new String[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings[i] = scanner.nextLine();
        }
        return strings;
    }

    private static Integer[] calcLength(final String[] strings) {
        final int length = strings.length;
        final Integer[] lengths = new Integer[length];
        for (int i = 0; i < length; i++) {
            lengths[i] = strings[i].length();
        }
        return lengths;
    }

    private static <T> void println(final T[] objects) {
        for (T object : objects) {
            System.out.println(object);
        }
    }
}
