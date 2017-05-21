package com.javarush.test.level10.lesson11.home09;

import java.util.*;

/**
 * Одинаковые слова в списке
 * Ввести с клавиатуры в список 20 слов.
 * Нужно подсчитать количество одинаковых слов в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>,
 * где первый параметр – уникальная строка,
 * а второй – число, сколько раз данная строка встречалась в списке.
 * Вывести содержимое словаря на экран.
 * В тестах регистр (большая/маленькая буква) влияет на результат.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final List<String> words = scanWords(length);
        final Map<String, Integer> map = countWords(words);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static List<String> scanWords(final int length) {
        final Scanner scanner = new Scanner(System.in);
        final List<String> words = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            words.add(scanner.nextLine());
        }
        return words;
    }

    private static Map<String, Integer> countWords(final List<String> list) {
        final Map<String, Integer> result = new HashMap<>();
        for (String line : list) {
            result.put(line, 0);
        }
        int count;
        String line;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            count = 0;
            line = entry.getKey();
            for (String line2 : list) {
                if (line.equals(line2)) {
                    count++;
                }
            }
            result.put(line, count);
        }
        return result;
    }
}
