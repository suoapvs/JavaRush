package com.javarush.test.level08.lesson11.home04;

import java.io.IOException;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(
                getMinimum(getIntegerList())
        );
    }

    public static int getMinimum(List<Integer> array)
    {
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        final Scanner scanner = new Scanner(System.in);
        int n;
        do
        {
            n = scanner.nextInt();
        }
        while (n <= 0);
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
