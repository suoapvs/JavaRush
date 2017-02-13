package com.javarush.test.level12.lesson12.home06;

/* Fly, Run, Climb для классов Cat, Dog, Tiger, Duck
1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
*/

public class Solution
{

    public interface Fly
    {
        void fly();
    }

    public interface Climb
    {
        void climb();
    }

    public interface Run
    {
        void run();
    }


    public class Cat implements Run, Climb
    {
        @Override
        public void climb()
        {
            System.out.println("Cat climb");
        }

        @Override
        public void run()
        {
            System.out.println("Cat run");
        }
    }

    public class Dog implements Run
    {
        @Override
        public void run()
        {
            System.out.println("Dog run");
        }
    }

    public class Tiger extends Cat
    {
        @Override
        public void climb()
        {
            System.out.println("Tiger climb");
        }

        @Override
        public void run()
        {
            System.out.println("Tiger run");
        }
    }

    public class Duck implements Run, Fly
    {
        @Override
        public void run()
        {
            System.out.println("Duck run");
        }

        @Override
        public void fly()
        {
            System.out.println("Duck fly");
        }
    }
}
