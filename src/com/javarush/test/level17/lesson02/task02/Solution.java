package com.javarush.test.level17.lesson02.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Вместе быстрее? Ща проверим :)
1. Разберись, что и как работает
2. Создай public static нить SortThread, которая в методе run отсортирует статический
массив testArray используя метод sort
*/

public class Solution
{
    public static int countThreads = 10;
    public static int[] testArray = new int[1000];

    static
    {
        for (int i = 0; i < Solution.testArray.length; i++)
        {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        initThreads();
    }

    public static void initThreads() throws InterruptedException
    {
        List<Thread> threads = new ArrayList<>(countThreads);
        for (int i = 0; i < countThreads; i++)
        {
            threads.add(new SortThread());
        }
        for (Thread thread : threads)
        {
            thread.start();
        }
        for (Thread thread : threads)
        {
            thread.join();
        }
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }

    public static class SortThread extends Thread
    {
        public void run()
        {
            sort(testArray);
        }
    }
}
