package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую половину.
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
        final String outputFile2 = scanner.nextLine();
        final String outputFile3 = scanner.nextLine();
        divideFile(inputFile, outputFile2, outputFile3);
    }

    private static void divideFile(final String from, final String to1, final String to2) {
        final byte[] input = new FileLoader(from).read();
        final byte[] output2 = new byte[input.length - input.length / 2];
        final byte[] output3 = new byte[input.length - output2.length];
        System.arraycopy(input, 0, output2, 0, output2.length);
        System.arraycopy(input, output2.length, output3, 0, output3.length);
        new FileLoader(to1).write(output2);
        new FileLoader(to2).write(output3);
    }

    static class FileLoader {
        private final String path;

        public FileLoader(final String path) {
            this.path = path;
        }

        public byte[] read() {
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

        public void write(byte[] bytes) {
            try (OutputStream outputStream = new FileOutputStream(this.path);)
            {
                outputStream.write(bytes);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
