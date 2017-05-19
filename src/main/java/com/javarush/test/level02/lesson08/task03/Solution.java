package com.javarush.test.level02.lesson08.task03;

/**
 * Минимум трех чисел
 * Написать функцию, которая вычисляет минимум из трёх чисел.
 */
public class Solution {

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    private static int min(int a, int b) {
        return (a < b ? a : b);
    }
}