package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/**
 * Массив из чисел в обратном порядке
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Расположить элементы массива в обратном порядке.
 * 4. Вывести результат на экран, каждое значение выводить с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 10;
        final int[] array = scan(length);
        reverse(array);
        print(array);
    }

    private static int[] scan(final int length) {
        final int[] array = new int[length];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void reverse(final int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static void print(final int[] array) {
        for (int number : array) {
            System.out.println(number + " ");
        }
    }
}
