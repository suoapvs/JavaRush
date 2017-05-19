package com.javarush.test.level03.lesson08.task02;

import java.util.Scanner;

/**
 * Зарплата через 5 лет
 * Ввести с клавиатуры Имя и два числа, вывести надпись:
 * name1 получает «число1» через «число2» лет.
 * Пример: Коля получает 3000 через 5 лет.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine();
        final int num1 = scanner.nextInt();
        final int num2 = scanner.nextInt();
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}