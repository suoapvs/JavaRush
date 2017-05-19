package com.javarush.test.level05.lesson09.task03;

/**
 * Создать класс Dog
 * Создать класс Dog (собака) с тремя конструкторами:
 * - Имя
 * - Имя, рост
 * - Имя, рост, цвет
 */
public class Dog {

    private final static int DEFAULT_HEIGHT = 20;
    private final static String DEFAULT_COLOR = "black";

    private final String name;
    private final int height;
    private final String color;

    public Dog(String name) {
        this(name, DEFAULT_HEIGHT);
    }

    public Dog(String name, int height) {
        this(name, height, DEFAULT_COLOR);
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
