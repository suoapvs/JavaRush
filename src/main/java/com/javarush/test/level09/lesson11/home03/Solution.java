package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Метод в try..catch
 * Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
 * Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа
 * и BufferedReader - а) этого метода в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение
 * и вывести на экран все введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 */
public class Solution {

    public static void main(String[] args) {
        readData();
    }

    private static void readData() {
        final List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception ex) {
            println(list);
        }
    }

    private static void println(final List<Integer> list) {
        list.forEach(System.out::println);
    }
}
