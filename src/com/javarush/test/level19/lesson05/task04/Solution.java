package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            final String oldWord = ".";
            final String newWord = "!";
            String inputFile = scanner.nextLine();
            String outputFile = scanner.nextLine();
            String text = new Loader(inputFile).read();
            text = text.replace(oldWord, newWord);
            new Loader(outputFile, text).write();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
