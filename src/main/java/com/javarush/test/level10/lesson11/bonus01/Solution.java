package com.javarush.test.level10.lesson11.bonus01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Нужно исправить программу, чтобы компилировалась и работала
 * Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
 * помещает их в HashMap и выводит на экран содержимое HashMap.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(
                    scanner.nextInt(),
                    scanner.nextLine()
            );
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Id=" + entry.getKey() + " Name=" + entry.getValue());
        }
    }
}
