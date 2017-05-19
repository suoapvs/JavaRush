package com.javarush.test.level03.lesson08.task03;

import java.util.Scanner;

/**
 * Скромность украшает человека
 * Ввести с клавиатуры имя и вывести надпись:
 * name зарабатывает $5,000. Ха-ха-ха!
 * Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String name = new Scanner(System.in).nextLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}