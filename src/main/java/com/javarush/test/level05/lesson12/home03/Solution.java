package com.javarush.test.level05.lesson12.home03;

/**
 * Создай классы Dog, Cat, Mouse.
 * Добавь по три поля в каждый класс, на твой выбор.
 * Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
 * Пример:
 * Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
 */
public class Solution {

    public static void main(String[] args) {
        final Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        final Cat tomCat = new Cat("Tom", 40, 20);
        final Dog someDog = new Dog("Barsik", 60, 25);
        System.out.println(jerryMouse);
        System.out.println(tomCat);
        System.out.println(someDog);
    }

    public static abstract class Pet {

        private final String name;
        private final int height;
        private final int tail;

        public Pet(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + this.name + '\'' +
                    ", height=" + this.height +
                    ", tail=" + this.tail +
                    '}';
        }

        public String getName() {
            return this.name;
        }

        public int getHeight() {
            return this.height;
        }

        public int getTail() {
            return this.tail;
        }
    }

    public static class Mouse extends Pet {

        public Mouse(String name, int height, int tail) {
            super(name, height, tail);
        }

        @Override
        public String toString() {
            return "Mouse" + super.toString();
        }
    }

    public static class Dog extends Pet {

        public Dog(String name, int height, int tail) {
            super(name, height, tail);
        }

        @Override
        public String toString() {
            return "Dog" + super.toString();
        }
    }

    public static class Cat extends Pet {

        public Cat(String name, int height, int tail) {
            super(name, height, tail);
        }

        @Override
        public String toString() {
            return "Cat" + super.toString();
        }
    }
}
