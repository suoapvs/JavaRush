package com.javarush.test.level05.lesson12.home05;

import java.util.Scanner;

/**
 * Вводить с клавиатуры числа и считать их сумму,
 * пока пользователь не введёт слово «сумма».
 * Вывести на экран полученную сумму.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String temp;
        while (true) {
            temp = scanner.next();
            if (temp.equals("сумма")) {
                break;
            } else {
                sum += Integer.parseInt(temp);
            }
        }
        System.out.println(sum);
    }
}
