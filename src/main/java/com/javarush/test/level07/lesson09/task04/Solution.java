package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Буква «р» и буква «л»
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву «р»
 * 2.2. удваивать все слова содержащие букву «л».
 * 2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
 * Пример:
 * роза
 * лира
 * лоза
 * Выходные данные:
 * лира
 * лоза
 * лоза
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final List<String> strings = scan(length);
        fix(strings);
        println(strings);
    }

    public static List<String> fix(final List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            if (line.contains("р") && line.contains("л")) {
                continue;
            }
            if (line.contains("р")) {
                list.remove(i--);
            } else if (line.contains("л")) {
                list.add(i++, line);
            }
        }
        return list;
    }

    private static List<String> scan(final int length) {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    private static void println(final List<String> list) {
        list.forEach(System.out::println);
    }
}