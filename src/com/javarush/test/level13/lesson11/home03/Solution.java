package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final String fileName = readFileName();
        final String textFromFile = readFile(fileName);
        System.out.println(textFromFile);
    }

    private static String readFileName()
    {
        return new Scanner(System.in).nextLine();
    }

    private static String readFile(final String fileName)
    {
        final StringBuilder sb = new StringBuilder();
        try (final BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                sb.append(line);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
