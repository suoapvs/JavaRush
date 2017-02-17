package com.javarush.test.level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final String fileName = new Scanner(System.in).nextLine();
        try (final FileInputStream input = new FileInputStream(fileName))
        {
            int max = 0;
            while (input.available() > 0)
            {
                int data = input.read();
                if (data > max)
                {
                    max = data;
                }
            }
            System.out.println(max);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
