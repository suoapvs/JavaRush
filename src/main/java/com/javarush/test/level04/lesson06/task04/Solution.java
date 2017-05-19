package com.javarush.test.level04.lesson06.task04;

import java.util.Scanner;

/**
 * Сравнить имена
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести
 * сообщение «Имена идентичны». Если имена разные, но их длины равны –
 * вывести сообщение – «Длины имен равны».
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String name1 = scanner.nextLine();
        final String name2 = scanner.nextLine();
        printEquals(name1, name2);
    }

    private static void printEquals(final String name1, final String name2) {
        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
