package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final String inputFile = scanner.nextLine();
        final String outputFile = scanner.nextLine();
        final byte[] inputArray = new FileLoader(inputFile).read();
        final byte[] transformedArray = transform(inputArray);
        new FileLoader(outputFile).write(transformedArray);
    }

    private static byte[] transform(final byte[] array)
    {
        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++)
        {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    static class FileLoader
    {
        private final String path;

        public FileLoader(final String path)
        {
            this.path = path;
        }

        public byte[] read()
        {
            byte[] buffer = null;
            try (final InputStream inputStream = new FileInputStream(this.path);)
            {
                if (inputStream.available() > 0)
                {
                    buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);
                }

            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
            return buffer;
        }

        public void write(byte[] bytes)
        {
            try (OutputStream outputStream = new FileOutputStream(this.path);)
            {
                outputStream.write(bytes);
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
