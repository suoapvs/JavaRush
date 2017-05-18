package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printList(createList());
    }

    public static ArrayList<String>[] createList()
    {
        final ArrayList<String>[] list = new ArrayList[10];
        final Random random = new Random();
        final char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String temp;
        for (int i = 0; i < list.length; i++)
        {
            list[i] = new ArrayList<>();
            for (int j = 0; j < random.nextInt(100); j++)
            {
                temp = "";
                for (int k = 0; k < random.nextInt(100); k++)
                {
                    temp += alphabet[random.nextInt(alphabet.length)];
                }
                list[i].add(temp);
            }
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (List<String> list : arrayOfStringList)
        {
            for (String line : list)
            {
                System.out.println(line);
            }
        }
    }
}