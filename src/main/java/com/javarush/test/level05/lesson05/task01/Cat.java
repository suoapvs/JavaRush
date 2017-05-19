package com.javarush.test.level05.lesson05.task01;

/**
 * Создать класс Cat
 * Создать класс Cat. У кота должно быть имя (name, String),
 * возраст (age, int), вес (weight, int), сила (strength, int).
 */
public class Cat {
    private final String name;
    private final int age;
    private final int weight;
    private final int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getStrength() {
        return this.strength;
    }
}
