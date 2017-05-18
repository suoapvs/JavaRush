package com.javarush.test.level16.lesson05.task01;

import java.util.ArrayList;
import java.util.List;

/* join
Подумайте, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызовите метод join в нужном месте.
Пример вывода:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        final Thread firstThread = new PrintListThread("firstThread");
        final Thread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static class PrintListThread extends Thread
    {
        public PrintListThread(String name)
        {
            super(name);
        }

        @Override
        public void run()
        {
            printList(getList(20), getName());
        }
    }

    public static void printList(List<String> list, String threadName)
    {
        for (String item : list)
        {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(final int n)
    {
        final List<String> result = new ArrayList<>();
        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                result.add(String.format("String %d", (i + 1)));
            }
        }
        return result;
    }
}
