package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            String fileName = scanner.nextLine();
            String text = new Loader(fileName).read();
            String word = "world";
            int count = count(text, word);
            System.out.println(count);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }


    private static int count(String text, String word)
    {
        int count = 0;
        for (String textWord : text.split(" "))
        {
            if (textWord.equalsIgnoreCase(word))
            {
                count++;
            }
        }
        return count;
    }
}
