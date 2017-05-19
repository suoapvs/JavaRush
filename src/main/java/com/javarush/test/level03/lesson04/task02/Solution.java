package com.javarush.test.level03.lesson04.task02;

/**
 * Мое имя
 * Вывести на экран свое имя 5 строк по 10 раз (через пробел).
 */
public class Solution {

    public static void main(String[] args) {
        final String name = "Yurii";
        for (int i = 0; i < 5; i++) {
            System.out.print(name);
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + name);
            }
            System.out.println();
        }
    }
}