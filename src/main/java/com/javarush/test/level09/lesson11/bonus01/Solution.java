package com.javarush.test.level09.lesson11.bonus01;

import java.io.*;
import java.util.Scanner;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        try (final Scanner scanner = new Scanner(System.in);
             final InputStream fileInputStream = new FileInputStream(scanner.nextLine());
             final OutputStream fileOutputStream = new FileOutputStream(scanner.nextLine()))
        {
            int count = 0;
            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                count++;
            }
            System.out.println("Скопировано байт " + count);
        }
    }
}
