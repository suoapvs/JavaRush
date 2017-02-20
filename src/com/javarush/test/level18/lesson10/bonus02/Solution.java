package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-с  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final String fileName = new Scanner(System.in).nextLine();
        String productName = "";
        for (int i = 1; i < args.length - 2; i++)
        {
            productName += args[i] + " ";
        }
        final String id = setSpaces(getId(fileName), 8);
        final String trueProductName = setSpaces(productName, 30);
        final String truePrice = setSpaces(args[args.length - 2], 8);
        final String trueQuantity = setSpaces(args[args.length - 1], 4);
        print(fileName, id + trueProductName + truePrice + trueQuantity);
    }

    private static void print(final String fileName, final String text)
    {
        try (final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
             final PrintWriter printWriter = new PrintWriter(bufferedWriter))
        {
            printWriter.println(text);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static String getId(String fileName)
    {
        final List<Long> allIds = new ArrayList<>();
        try (final BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                line = line.substring(0, 8).replaceAll("\\s", "");
                allIds.add(Long.parseLong(line));
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        final Long MyId = Collections.max(allIds) + 1;
        return MyId.toString();
    }


    public static String setSpaces(String previousName, int count)
    {
        String trueName;
        if (previousName.length() > count)
        {
            trueName = previousName.substring(0, count);
        } else
        {
            String spaces = "";
            for (int i = 0; i < (count - previousName.length()); i++)
            {
                spaces += " ";
            }
            trueName = previousName + spaces;
        }
        return trueName;
    }
}
