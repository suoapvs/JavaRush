package com.javarush.test.level12.lesson09.task03;

/* Fly, Run, Swim для классов Dog, Fish, Bird, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Dog(собака), Fish(рыба), Bird(птица), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public interface Fly
    {
        void fly();
    }

    public interface Run
    {
        void run();
    }

    public interface Swim
    {
        void swim();
    }

    public class Dog implements Run, Swim
    {
        public void run()
        {
            System.out.println("Dog Run");
        }

        public void swim()
        {
            System.out.println("Dog Swim!");
        }
    }

    public class Fish implements Swim
    {
        public void swim()
        {
            System.out.println("Fish Swim!");
        }
    }

    public class Bird implements Fly, Run, Swim
    {
        public void fly()
        {
            System.out.println("Bird Fly");
        }

        public void run()
        {
            System.out.println("Bird Run");
        }

        public void swim()
        {
            System.out.println("Bird Swim");
        }
    }

    public class Airplane implements Fly, Run
    {
        public void fly()
        {
            System.out.println("Airplane Fly");
        }

        public void run()
        {
            System.out.println("Airplane Run");
        }
    }
}
