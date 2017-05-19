package com.javarush.test.level05.lesson05.task05;

/**
 * Провести три боя  попарно между котами
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран.
 */
public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 1, 25, 5);
        Cat cat2 = new Cat("Petka", 2, 34, 4);
        Cat cat3 = new Cat("Mashka", 1, 18, 1);
        System.out.println(cat1.name + " vs " + cat2.name + ": " + cat1.fight(cat2));
        System.out.println(cat1.name + " vs " + cat3.name + ": " + cat1.fight(cat3));
        System.out.println(cat3.name + " vs " + cat2.name + ": " + cat2.fight(cat3));
    }

    public static class Cat {
        public static int count = 0;
        public static int fightCount = 0;
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;
            int score = this.isYounger(anotherCat) ? 1 : -1;
            score += this.isWeighter(anotherCat) ? 1 : -1;
            score += this.isStronger(anotherCat) ? 1 : -1;
            return (score > 0);
            /*int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
            int score = agePlus + weightPlus + strengthPlus;
            return score > 2;*/ //эквивалентно return score > 2 ? true : false;
        }

        private boolean isStronger(final Cat anotherCat) {
            return (this.strength > anotherCat.strength);
        }

        private boolean isWeighter(final Cat anotherCat) {
            return (this.weight > anotherCat.weight);
        }

        private boolean isYounger(final Cat anotherCat) {
            return (this.age < anotherCat.age);
        }
    }
}
