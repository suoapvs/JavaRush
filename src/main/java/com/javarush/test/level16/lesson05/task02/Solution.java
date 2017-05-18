package com.javarush.test.level16.lesson05.task02;

import java.util.ArrayList;
import java.util.List;

/* Horse Racing
Разберись, что делает программа.
Реализуй метод calculateHorsesFinished. Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
*/

public class Solution
{
    public static int countHorses = 10;

    public static void main(String[] args) throws InterruptedException
    {
        final List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != countHorses)
        {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException
    {
        int countFinished = 0;
        for (Horse horse : horses)
        {
            if (!horse.isFinished())
            {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
            countFinished++;
        }
        return countFinished;
    }

    public static class Horse extends Thread
    {
        private boolean isFinished;

        public Horse(final String name)
        {
            super(name);
        }

        public boolean isFinished()
        {
            return this.isFinished;
        }

        @Override
        public void run()
        {
            for (int i = 0; i <= 1000; i++)
            {
                if (i == 1000)
                {
                    System.out.println(getName() + " is finished!");
                    this.isFinished = true;
                }
            }
        }
    }

    public static List<Horse> prepareHorsesAndStart()
    {
        final List<Horse> horses = prepareHorses();
        startHorses(horses);
        return horses;
    }

    private static List<Horse> prepareHorses()
    {
        final List<Horse> horses = new ArrayList<>(countHorses);
        for (int i = 1; i < countHorses + 1; i++)
        {
            horses.add(new Horse("Horse_" + (i < 10 ? "0" : "") + i));
        }
        return horses;
    }

    public static void startHorses(List<Horse> horses)
    {
        for (Horse horse : horses)
        {
            horse.start();
        }
    }
}
