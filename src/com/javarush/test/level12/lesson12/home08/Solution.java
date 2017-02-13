package com.javarush.test.level12.lesson12.home08;

/* Интерфейсы к классу Human
Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
Добавлять методы в класс Human запрещается.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human = new Human();
        System.out.println(human);
    }

    public interface Worker
    {
        void workLazy();
    }

    public interface Businessman
    {
        void workHard();
    }

    public interface Secretary
    {
        void workLazy();
    }

    public static interface Miner
    {
        void workVeryHard();
    }

    public static class Human implements Businessman, Worker, Secretary
    {
        @Override
        public void workHard()
        {
        }

        @Override
        public void workLazy()
        {
        }
    }
}
