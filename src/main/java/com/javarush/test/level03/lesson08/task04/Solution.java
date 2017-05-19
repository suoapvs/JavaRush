package com.javarush.test.level03.lesson08.task04;

import java.util.Scanner;

/**
 * Спонсор - это звучит гордо
 * Ввести с клавиатуры два имени и вывести надпись:
 * name1 проспонсировал name2 и она стала известной певицей.
 * Пример: Коля проспонсировал Лену, и она стала известной певицей.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String message = "%s проспонсировал %s, и она стала известной певицей.";
        final Scanner scanner = new Scanner(System.in);
        final String name1 = scanner.nextLine();
        final String name2 = scanner.nextLine();
        System.out.println(String.format(message, name1, name2));
    }
}