package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;
import java.util.Scanner;

/**
 * Нужно добавить в программу новую функциональность
 * Задача: Программа вводит два имени файла.
 * И копирует первый файл на место, заданное вторым именем.
 * Новая задача: Программа вводит два имени файла.
 * И копирует первый файл на место, заданное вторым именем.
 * Если файла (который нужно копировать) с указанным именем не существует, то
 * программа должна вывести надпись «Файл не существует.»
 * и еще раз прочитать имя файла с консоли,
 * а уже потом считывать файл для записи.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        String sourceFileName = scanner.nextLine();
        if (!new File(sourceFileName).exists()) {
            System.out.println("Файл не существует.");
            sourceFileName = scanner.nextLine();
        }
        String destinationFileName = scanner.nextLine();
        try (final InputStream fileInputStream = new FileInputStream(sourceFileName);
                final OutputStream fileOutputStream = new FileOutputStream(destinationFileName)) {
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
        }
    }
}
