package com.javarush.test.level07.lesson12.bonus02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Нужно заменить функциональность программы
 * Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 * Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
 * Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 * Потом программа строит новый список. Если в строке чётное число букв, строка удваивается,
 * если нечётное – утраивается. Программа выводит содержимое нового списка на экран.
 * Пример ввода:
 * Кот
 * Коты
 * Я
 * Пример вывода:
 * Кот Кот Кот
 * Коты Коты
 * Я Я Я
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final List<String> lines = scanLines();
        final List<String> newLines = modify(lines);
        println(newLines);
    }

    private static List<String> scanLines() {
        final Scanner scanner = new Scanner(System.in);
        final List<String> lines = new ArrayList<>();
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

    private static List<String> modify(final List<String> lines) {
        final List<String> newLines = new ArrayList<>();
        for (String line : lines) {
            int length = (line.length() % 2 == 0) ? 2 : 3;
            for (int i = 0; i < length; i++) {
                newLines.add(line);
            }
        }
        return newLines;
    }

    private static void println(final List<String> lines) {
        String temp = lines.get(0);
        for (String line : lines) {
            if (!line.equals(temp)) {
                System.out.println();
            }
            System.out.print(line + " ");
            temp = line;
        }
    }
}
