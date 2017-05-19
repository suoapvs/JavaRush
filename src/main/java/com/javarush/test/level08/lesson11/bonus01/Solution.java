package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/
public class Solution
{
    private static final Map<String, Integer> MONTHS = new HashMap<>();

    static {
        MONTHS.put("January", 1);
        MONTHS.put("February", 2);
        MONTHS.put("March", 3);
        MONTHS.put("April", 4);
        MONTHS.put("May", 5);
        MONTHS.put("June", 6);
        MONTHS.put("July", 7);
        MONTHS.put("August", 8);
        MONTHS.put("September", 9);
        MONTHS.put("October", 10);
        MONTHS.put("November", 11);
        MONTHS.put("December", 12);
    }

    public static void main(String[] args) throws IOException
    {
        final String month = scanMonth();
        println(month);
    }

    private static String scanMonth() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void println(final String month) {
        System.out.println(month + " is " + MONTHS.get(month) + " month");
    }
}
