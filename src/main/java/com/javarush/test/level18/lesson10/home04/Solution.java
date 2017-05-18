package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            String fileName1 = scanner.nextLine();
            String fileName2 = scanner.nextLine();
            Copywriter copywriter = new Copywriter(fileName1, fileName2);
            copywriter.copy();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
