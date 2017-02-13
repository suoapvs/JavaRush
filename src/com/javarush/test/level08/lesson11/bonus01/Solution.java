package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final Scanner scanner = new Scanner(System.in);
        final String month = scanner.nextLine();
        final Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
        System.out.println(month + " is " + months.get(month) + " month");
    }
}
