package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in);)
        {
            String inputFileName = scanner.nextLine();
            String outputFileName = scanner.nextLine();
            byte[] bytes = new Loader(inputFileName).read();
            byte[] evenBytes = getEvenBytes(bytes);
            new Loader(outputFileName, evenBytes).write();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private static byte[] getEvenBytes(byte[] bytes)
    {
        byte[] evenBytes = new byte[bytes.length / 2];
        int evenCounter = 0;
        for (int i = 0; i < bytes.length; i++)
        {
            if (i % 2 == 0)
            {
                evenBytes[evenCounter++] = bytes[i];
            }
        }
        return evenBytes;
    }
}
