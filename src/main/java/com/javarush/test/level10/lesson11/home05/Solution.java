package com.javarush.test.level10.lesson11.home05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        final List<Character> alphabet = getAlphabet();
        final List<String> lines = scanLines();
        final int[] count = getCount(lines, alphabet);
        print(alphabet, count);
    }

    private static List<Character> getAlphabet()
    {
        final List<Character> alphabet = new ArrayList<>();
        for (char c : "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray())
        {
            alphabet.add(c);
        }
        return alphabet;
    }

    private static List<String> scanLines()
    {
        final Scanner scanner = new Scanner(System.in);
        final List<String> lines = new ArrayList<>();
        for (int i = 0; i < 1; i++)
        {
            lines.add(scanner.nextLine().toLowerCase());
        }
        return lines;
    }

    private static int[] getCount(
            final List<String> list,
            final List<Character> alphabet
    )
    {
        final int[] count = new int[alphabet.size()];
        for (String line : list)
        {
            for (char c : line.toCharArray())
            {
                count[alphabet.indexOf(c)]++;
            }
        }
        return count;
    }

    private static void print(final List<Character> alphabet, final int[] count)
    {
        for (int i = 0; i < alphabet.size(); i++)
        {
            System.out.println(alphabet.get(i) + " " + count[i]);
        }
    }
}
