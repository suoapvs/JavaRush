package com.javarush.test.level04.lesson06.task06;

import java.util.Scanner;

/**
 * И 18-ти достаточно
 * Ввести с клавиатуры имя и возраст.
 * Если возраст больше 20 вывести надпись «И 18-ти достаточно».
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine();
        final int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
