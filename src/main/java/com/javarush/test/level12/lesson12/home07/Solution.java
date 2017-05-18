package com.javarush.test.level12.lesson12.home07;

/* Fly, Run, Swim для классов Duck, Penguin, Toad
Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
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

    public class Duck implements Fly, Run, Swim
    {
        @Override
        public void run()
        {
            System.out.println("Duck run");
        }

        public void fly()
        {
            System.out.println("Duck fly");
        }

        public void swim()
        {
            System.out.println("Duck swim");
        }
    }

    public class Penguin implements Run, Swim
    {
        @Override
        public void run()
        {
            System.out.println("Penguin run");
        }

        @Override
        public void swim()
        {
            System.out.println("Penguin swim");
        }
    }

    public class Toad implements Swim
    {
        @Override
        public void swim()
        {
            System.out.println("Toad swim");
        }
    }
}
