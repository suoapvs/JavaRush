package com.javarush.test.level10.lesson11.home10;

import java.util.ArrayList;
import java.util.Scanner;

/* Безопасное извлечение из списка
Создать список целых чисел. Ввести с клавиатуры 20 целых чисел. Создать метод по безопасному извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index).
Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            list.add(scanner.nextInt());
        }
        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
    {
        int result;
        try
        {
            result = list.get(index);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            result = defaultValue;
        }

        return result;
    }

}
