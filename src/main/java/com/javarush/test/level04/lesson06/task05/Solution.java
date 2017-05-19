package com.javarush.test.level04.lesson06.task05;

import java.util.Scanner;

/**
 * 18+
 * Ввести с клавиатуры имя и возраст.
 * Если возраст меньше 18 вывести надпись «Подрасти еще».
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine();
        final int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
