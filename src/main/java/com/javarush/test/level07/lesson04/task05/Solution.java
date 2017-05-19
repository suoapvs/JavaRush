package com.javarush.test.level07.lesson04.task05;

import java.util.Scanner;

/**
 * Один большой массив и два маленьких
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких:
 * половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран,
 * каждое значение выводить с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final int[] bigArray = scan(length);
        final int[] littleArray1 = new int[length / 2];
        final int[] littleArray2 = new int[length / 2];
        System.arraycopy(bigArray, 0, littleArray1, 0, littleArray1.length);
        System.arraycopy(bigArray, littleArray1.length, littleArray2, 0, littleArray2.length);
        println(littleArray2);
    }

    private static int[] scan(final int length) {
        final int[] array = new int[20];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void println(final int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
