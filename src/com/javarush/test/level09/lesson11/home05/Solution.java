package com.javarush.test.level09.lesson11.home05;

import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    private final static char[] VOWELS = {'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception
    {
        splitLine(new Scanner(System.in).nextLine());
    }

    public static void splitLine(String line)
    {
        String vowelsLine = "";
        String otherLine = "";
        for (char c : line.replace(" ", "").toCharArray())
        {
            if (isVowel(c))
            {
                vowelsLine += c + " ";
            } else
            {
                otherLine += c + " ";
            }
        }
        System.out.println(vowelsLine);
        System.out.println(otherLine);
    }


    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : VOWELS)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
