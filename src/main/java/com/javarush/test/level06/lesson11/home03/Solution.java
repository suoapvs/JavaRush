package com.javarush.test.level06.lesson11.home03;

/**
 * Переставь один модификатор static
 * Переставь один модификатор static, чтобы пример скомпилировался.
 */
public class Solution {

    private static int A = 5;
    private int B = 2;
    private int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}

