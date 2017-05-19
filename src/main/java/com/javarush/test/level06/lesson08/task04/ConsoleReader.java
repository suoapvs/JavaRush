package com.javarush.test.level06.lesson08.task04;

import java.util.Scanner;

/**
 * Класс ConsoleReader
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() – читает с клавиатуры строку
 * int readInt() – читает с клавиатуры число
 * double readDouble() – читает с клавиатуры дробное число
 * void readLn() – ждет нажатия enter [использовать readString()]
 */
public class ConsoleReader {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static String readString() throws Exception {
        return SCANNER.nextLine();
    }

    public static int readInt() throws Exception {
        return SCANNER.nextInt();
    }

    public static double readDouble() throws Exception {
        return SCANNER.nextDouble();
    }

    public static void readLn() throws Exception {
        readString();
    }
}
