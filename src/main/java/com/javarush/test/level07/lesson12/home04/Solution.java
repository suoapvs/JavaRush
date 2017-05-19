package com.javarush.test.level07.lesson12.home04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
 * Создать список строк.
 * Ввести строки с клавиатуры и добавить их в список.
 * Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
 * Вывести строки на экран, каждую с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final List<String> strings = scan();
        println(strings);
    }

    private static List<String> scan() {
        final List<String> strings = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        String temp;
        while (true) {
            temp = scanner.nextLine();
            if (temp.equals("end")) {
                break;
            }
            strings.add(temp);
        }
        return strings;
    }

    private static void println(final List<String> strings) {
        strings.forEach(System.out::println);
    }
}
