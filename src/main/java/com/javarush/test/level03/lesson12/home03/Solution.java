package com.javarush.test.level03.lesson12.home03;

import java.util.Scanner;

/**
 * Я буду зарабатывать $50 в час
 * Ввести с клавиатуры число n.
 * Вывести на экран надпись «Я буду зарабатывать $n в час».
 * Пример:
 * Я буду зарабатывать $50 в час
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String message = "Я буду зарабатывать $%d в час";
        final int salary = new Scanner(System.in).nextInt();
        System.out.println(String.format(message, salary));
    }
}