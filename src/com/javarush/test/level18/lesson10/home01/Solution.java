package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/


import java.io.FileInputStream;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final String fileName = args[0];
        try (final FileInputStream fileInputStream = new FileInputStream(fileName)) {
            final byte[] buffer = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0)
            {
                fileInputStream.read(buffer);
            }
            int charCount = 0;
            for (byte aBuffer : buffer)
            {
                if ((aBuffer > 64 && aBuffer < 91) || (aBuffer > 96 && aBuffer < 123))
                {
                    charCount++;
                }
            }
            System.out.print(charCount);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
