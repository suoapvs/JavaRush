package com.javarush.test.level08.lesson11.home05;

import java.io.IOException;
import java.util.Scanner;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final String line = new Scanner(System.in).nextLine();
        final char[] array = line.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] == ' ')  && (i < array.length - 1) && (array[i + 1] != ' '))
            {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
        }
        System.out.println(array);
    }


}
