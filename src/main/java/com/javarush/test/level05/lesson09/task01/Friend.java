package com.javarush.test.level05.lesson09.task01;

/**
 * Создать класс Friend
 * Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 */
public class Friend {

    private final String name;
    private final int age;
    private final boolean gender;

    public Friend(final String name) {
        this(name, 0, false);
    }

    public Friend(final String name, final int age) {
        this(name, age, false);
    }

    public Friend(final String name, final int age, final boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}