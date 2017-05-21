package com.javarush.test.level10.lesson11.home10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Безопасное извлечение из списка
 * Создать список целых чисел. Ввести с клавиатуры 20 целых чисел.
 * Создать метод по безопасному извлечению чисел из списка:
 * int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
 * Метод должен возвращать элемент списка (list) по его индексу (index).
 * Если в процессе получения элемента возникло исключение, его нужно перехватить,
 * и метод должен вернуть defaultValue.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 20;
        final List<Integer> list = scan(length);
        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    private static List<Integer> scan(final int length) {
        final List<Integer> list = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static int safeGetElement(
            final List<Integer> list,
            final int index,
            final int defaultValue
    ) {
        int result;
        try {
            result = list.get(index);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = defaultValue;
        }
        return result;
    }

}
