package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
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
            String inputFileName = scanner.nextLine();
            String outputFileName = scanner.nextLine();
            String text = new Loader(inputFileName).read();
            String newText = replacePunctuationSymbols(text);
            new Loader(outputFileName, newText).write();

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private static String replacePunctuationSymbols(String text)
    {
        return text.replaceAll("\\p{Punct}", "");
    }
}
