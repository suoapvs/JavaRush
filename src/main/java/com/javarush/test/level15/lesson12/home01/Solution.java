package com.javarush.test.level15.lesson12.home01;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final List<String> lines = readLines();
        for (String value : lines)
        {
            if (value.contains("."))
            {
                ifContainsPoint(value);
            } else
            {
                ifNotContainsPoint(value);
            }
        }
    }

    private static void ifContainsPoint(final String value)
    {
        try
        {
            print(Double.parseDouble(value));
        }
        catch (NumberFormatException e)
        {
            print(value);
        }
    }

    private static void ifNotContainsPoint(final String value)
    {
        try
        {
            Integer integer = Integer.parseInt(value);
            if (integer > 0 && integer < 128)
            {
                print((short) ((int) integer));
            } else if (integer >= 128)
            {
                print(integer);
            } else
            {
                print(value);
            }
        }
        catch (NumberFormatException e)
        {
            print(value);
        }
    }

    private static List<String> readLines()
    {
        final Scanner scanner = new Scanner(System.in);
        final List<String> lines = new ArrayList<>();
        while (true)
        {
            String input = scanner.nextLine();
            if (input.equals("exit"))
            {
                break;
            }
            lines.add(input);
        }
        return lines;
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
