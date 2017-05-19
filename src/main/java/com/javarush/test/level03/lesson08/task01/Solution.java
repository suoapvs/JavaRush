package com.javarush.test.level03.lesson08.task01;

import java.util.Scanner;

/**
 * Как захватить мир
 * Ввести с клавиатуры число и имя, вывести на экран строку:
 * «имя» захватит мир через «число» лет. Му-ха-ха!
 * Пример: Вася захватит мир через 8 лет. Му-ха-ха!
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();
        final String name = scanner.nextLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}