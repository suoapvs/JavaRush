package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть все потоки ввода-вывода
2.2 выбросить исключение DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        while (true)
        {
            try
            {
                checkFile(scanner.nextLine());
            }
            catch (DownloadException ex)
            {
                ex.printStackTrace();
                break;
            }
        }
    }

    private static void checkFile(final String path) throws DownloadException
    {
        try (final InputStream stream = new FileInputStream(path))
        {
            if (stream.available() < 1000)
            {
                throw new DownloadException();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static class DownloadException extends Exception
    {
    }
}
