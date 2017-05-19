package com.javarush.test.level04.lesson02.task05;

/**
 * Подсчитать количество котов
 * Написать код, чтобы правильно считалось количество созданных котов (count)
 * и на экран выдавалось правильно их количество.
 */
public class Solution {

    public static void main(String[] args) {
        final Cat cat1 = new Cat();
        final Cat cat2 = new Cat();
        System.out.println("Cats count is " + Cat.getCatsCount());
    }

    public static class Cat {

        private static int count = 0;

        Cat() {
            cointIncr();
        }

        public static int getCatsCount() {
            return Cat.count;
        }

        private static void cointIncr() {
            Cat.count++;
        }
    }
}