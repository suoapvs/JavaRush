package com.javarush.test.level16.lesson07.task05;

import java.util.concurrent.TimeUnit;

/* Аэропорт
1. Разберись, что делает программа.
2. Исправь метод takingOff(взлет) - сейчас он работает оооочень долго. Взлет должен занимать 100 миллисекунд.
3. Реализуй метод waiting по аналогии с методом takingOff. Время ожидания не должно превышать время взлета.
*/
public class Solution
{
    public static volatile Runway RUNWAY = new Runway();   //1 взлетная полоса

    public static void main(String[] args) throws InterruptedException
    {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }

    public static class Plane extends Thread
    {
        public Plane(final String name)
        {
            super(name);
            start();
        }

        @Override
        public void run()
        {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff)
            {
                if (RUNWAY.getTakingOffPlane() == null)
                {
                    RUNWAY.setTakingOffPlane(this);
                    System.out.println(getName() + " взлетает");
                    takingOff();
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane()))
                {
                    System.out.println(getName() + " ожидает");
                    waiting();
                }
            }
        }
    }

    private static void waiting()
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    private static void takingOff()
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public static class Runway
    {
        private Thread takingOffPlane;

        public Thread getTakingOffPlane()
        {
            return takingOffPlane;
        }

        public void setTakingOffPlane(final Thread takingOffPlane)
        {
            synchronized (this)
            {
                this.takingOffPlane = takingOffPlane;
            }
        }
    }
}
