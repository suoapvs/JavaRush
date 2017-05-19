package com.javarush.test.level07.lesson06.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 строчек: «101», «102», «103», «104», «105»
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
 * 3. Удали первую, среднюю и последнюю.
 * 4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
 * 5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
 * Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 5;
        final List<String> strings = create(length);
        remove(strings);
        println(strings);
        printlnSize(strings);
    }

    private static List<String> create(final int length) {
        final List<String> strings = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            strings.add("10" + i);
        }
        return strings;
    }

    private static void remove(final List<String> strings) {
        final int first = 0;
        strings.remove(first);
        final int middle = (strings.size() - 1) / 2;
        strings.remove(middle);
        final int last = strings.size() - 1;
        strings.remove(last);
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }

    private static void printlnSize(final List<String> strings) {
        System.out.println(strings.size());
    }
}
