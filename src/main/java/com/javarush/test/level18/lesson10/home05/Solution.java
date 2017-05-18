package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            String inputFileName = scanner.nextLine();
            String outputFileName = scanner.nextLine();
            List<Double> doubleNumbers = selectNumbers(inputFileName);
            Converter converter = new Converter(doubleNumbers);
            List<Integer> integersNumber = converter.getIntegers();
            saveNumbers(outputFileName, integersNumber);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private static List<Double> selectNumbers(String fileName) throws IOException
    {
        List<Double> numbers = new ArrayList<>();
        String numbersString = new Loader(fileName).read();
        for (String number : numbersString.split(" "))
        {
            numbers.add(Double.parseDouble(number));
        }
        return numbers;
    }

    private static void saveNumbers(String fileName, List<Integer> numbers) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers)
        {
            sb.append(number).append(" ");
        }
        new Loader(fileName, sb.toString()).write();
    }
}
