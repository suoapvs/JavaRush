package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final int[] array = new int[10];
        final Scanner scanner = new Scanner(System.in);
        for (int i = array.length - 1; i >= 0; i--)
        {
            array[i] = scanner.nextInt();
        }
        for (int number : array)
        {
            System.out.println(number);
        }
    }
}
