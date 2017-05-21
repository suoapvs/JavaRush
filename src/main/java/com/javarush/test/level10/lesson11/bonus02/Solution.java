package com.javarush.test.level10.lesson11.bonus02;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Нужно добавить в программу новую функциональность
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 * Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны.
 * Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран.
 * <p>
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 * 1
 * Мыла
 * <p>
 * Пример вывода:
 * 1 Мыла
 * 2 Рама
 * 1 Мама
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final Map<String, Integer> map = scan();
        println(map);
    }

    private static Map<String, Integer> scan() {
        final Map<String, Integer> map = new HashMap<>();
        final Scanner scanner = new Scanner(System.in);
        int key;
        String value;
        while (true) {
            try {
                key = scanner.nextInt();
                value = scanner.nextLine();
                map.put(value, key);
            } catch (Exception e) {
                break;
            }
        }
        return map;
    }

    private static void println(final Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
