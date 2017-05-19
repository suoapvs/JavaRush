package com.javarush.test.level05.lesson12.home02;

/**
 * Man and Woman
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name(String), age(int), address(String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
 */
public class Solution {

    public static void main(String[] args) {
        final Man man1 = new Man("Vasya", 20, "Some address 1");
        final Man man2 = new Man("Petya", 25, "Some address 2");
        final Woman woman1 = new Woman("Oksana", 22, "Some address 3");
        final Woman woman2 = new Woman("Anna", 18, "Some address 4");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static abstract class Human {

        private final String name;
        private final int age;
        private final String address;

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getAddress() {
            return this.address;
        }
    }

    public static class Man extends Human {

        public Man(String name, int age, String address) {
            super(name, age, address);
        }
    }

    public static class Woman extends Human {

        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }
}
