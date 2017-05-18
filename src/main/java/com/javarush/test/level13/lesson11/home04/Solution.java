package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final String fileName = readFileName();
        final List<String> lines = readLines();
        writeInFile(fileName, lines);
    }

    private static String readFileName()
    {
        return new Scanner(System.in).nextLine();
    }

    private static List<String> readLines()
    {
        final List<String> lines = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        String line;
        while (true)
        {
            line = scanner.nextLine();
            if (line.equals("exit"))
            {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

    private static void writeInFile(final String fileName, final List<String> lines)
    {
        try (FileWriter writer = new FileWriter(fileName))
        {
            for (String line : lines)
            {
                writer.write(line + System.lineSeparator());
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
