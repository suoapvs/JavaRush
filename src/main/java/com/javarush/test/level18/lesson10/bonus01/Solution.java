package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        final String type = args[0];
        final String inputFile = args[1];
        final String outputFile = args[2];
        final byte[] buffer = read(inputFile);
        final byte[] result = update(buffer, type);
        write(outputFile, result);
    }

    private static byte[] update(final byte[] array, final String type) {
        final byte[] result;
        if (type.equals("-e"))
        {
            result = encode(array);
        } else if (type.equals("-d"))
        {
            result = decode(array);
        } else
        {
            result = new byte[0];
        }
        return result;
    }

    private static byte[] encode(byte[] array)
    {
        final String pKey = "myKey";
        final byte[] key = pKey.getBytes();
        final byte[] res = new byte[array.length];
        for (int i = 0; i < array.length; i++)
        {
            res[i] = (byte) (array[i] ^ key[i % key.length]);
        }
        return res;
    }

    private static byte[] decode(byte[] array)
    {
        final String pKey = "myKey";
        final byte[] key = pKey.getBytes();
        final byte[] res = new byte[array.length];
        for (int i = 0; i < array.length; i++)
        {
            res[i] = (byte) (array[i] ^ key[i % key.length]);
        }
        return res;
    }

    private static void write(final String fileName, final byte[] array)
    {
        try (final OutputStream outputStream = new FileOutputStream(fileName);)
        {
            outputStream.write(array);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private static byte[] read(final String fileName)
    {
        byte[] buffer;
        try (final InputStream inputStream = new FileInputStream(fileName))
        {
            buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            buffer = new byte[0];
        }
        return buffer;
    }
}
