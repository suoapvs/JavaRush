package com.javarush.test.level16.lesson07.task03;

/* Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
*/

import java.util.concurrent.TimeUnit;

public class Solution
{
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException
    {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        TimeUnit.SECONDS.sleep(4);
        isStopped = true;
        TimeUnit.SECONDS.sleep(1);
    }

    public static class Clock extends Thread
    {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds)
        {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run()
        {
            try
            {
                while (!isStopped)
                {
                    printTime();
                }
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }

        private void printTime() throws InterruptedException
        {
            TimeUnit.SECONDS.sleep(1);
            this.seconds++;
            correctedTime();
            printlnTime();
        }

        private void printlnTime()
        {
            if (this.hours + this.minutes + this.seconds == 0)
            {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else
            {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }

        private void correctedTime()
        {
            if (this.seconds >= 60)
            {
                this.seconds = 0;
                this.minutes++;
            }
            if (this.minutes >= 60)
            {
                this.minutes = 0;
                this.hours++;
            }
            if (this.hours >= 24)
            {
                this.hours = 0;
            }
        }
    }
}
