package com.javarush.test.level07.lesson09.task01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            list.add(scanner.nextInt());
        }
        final List<Integer> dividedIntoThree = new ArrayList<>();
        final List<Integer> dividedIntoTwo = new ArrayList<>();
        final List<Integer> other = new ArrayList<>();
        for (Integer integer : list)
        {
            if (integer % 3 == 0)
            {
                dividedIntoThree.add(integer);
            }
            if (integer % 2 == 0)
            {
                dividedIntoTwo.add(integer);
            }
            if ((integer % 3 != 0) && (integer % 2 != 0)){
                other.add(integer);
            }
        }
        printList(dividedIntoThree);
        printList(dividedIntoTwo);
        printList(other);
    }

    public static void printList(final List<Integer> list) {
        for (Integer integer : list)
        {
            System.out.println(integer);
        }
    }
}
