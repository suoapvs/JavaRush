package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printList(createList());
    }

    public static ArrayList<int[]> createList()
    {
        final ArrayList<int[]> list = new ArrayList<>();
        int[] sizes = {5, 2, 4, 7, 0};
        int[] array;
        for (int size : sizes)
        {
            array = new int[size];
            Arrays.fill(array, size);
            list.add(array);
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            System.out.println(Arrays.toString(array));
        }
    }
}
