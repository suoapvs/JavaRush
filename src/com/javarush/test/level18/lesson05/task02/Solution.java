package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final String fileName = new Scanner(System.in).nextLine();
        try (final FileInputStream inputStream = new FileInputStream(fileName))
        {
            final byte[] buffer = new byte[inputStream.available()];
            if (inputStream.available() > 0)
            {
                inputStream.read(buffer);
            }
            int comma = 0;
            for (byte b : buffer)
            {
                if (b == 44)
                {
                    comma++;
                }
            }
            System.out.println(comma);
        }
    }
}
