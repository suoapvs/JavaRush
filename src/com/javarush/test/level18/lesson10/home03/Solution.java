package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final String fileName1;
        final String fileName2;
        final String fileName3;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            fileName3 = reader.readLine();
        }

        try (FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1, true);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2);
             FileInputStream fileInputStream3 = new FileInputStream(fileName3))
        {
            byte[] buffer2 = new byte[fileInputStream2.available()];
            fileInputStream2.read(buffer2);

            byte[] buffer3 = new byte[fileInputStream3.available()];
            fileInputStream3.read(buffer3);

            fileOutputStream1.write(buffer2);
            fileOutputStream1.write(buffer3);
        }
    }
}
