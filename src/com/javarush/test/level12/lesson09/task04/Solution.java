package com.javarush.test.level12.lesson09.task04;

/* Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
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

    public class Human implements Run, Swim
    {
        public void run()
        {
            System.out.println("Human Run");
        }

        public void swim()
        {
            System.out.println("Human Swim");
        }
    }

    public class Duck implements Run, Swim, Fly
    {
        public void fly()
        {
            System.out.println("Duck Fly");
        }

        public void run()
        {
            System.out.println("Duck Run");
        }

        public void swim()
        {
            System.out.println("Duck Swim");
        }
    }

    public class Penguin implements Run, Swim
    {
        public void run()
        {
            System.out.println("Penguin Run");
        }

        public void swim()
        {
            System.out.println("Penguin Swim");
        }
    }

    public class Airplane implements Run, Fly
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
