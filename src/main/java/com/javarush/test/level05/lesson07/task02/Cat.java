package com.javarush.test.level05.lesson07.task02;

/**
 * Создать класс Cat
 * Создать класс Cat (кот) с пятью инициализаторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
 * - вес, цвет, адрес ( чужой домашний кот)
 * Задача инициализатора – сделать объект валидным.
 * Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить. То же касательно возраста.
 * А вот имени может и не быть (null). То же касается адреса: null.
 */
public class Cat {

    private final static int DEFAULT_AGE = 3;
    private final static int DEFAULT_WEIGHT = 5;
    private final static String DEFAULT_COLOUR = "White";

    private String name;
    private int age;
    private int weight;
    private String address;
    private String colour;

    public void initialize(final String name) {
        initialize(name, DEFAULT_AGE);
    }

    public void initialize(final String name, final int age) {
        initialize(name, DEFAULT_WEIGHT, age);
    }

    public void initialize(final String name, final int weight, final int age) {
        initialize(weight, DEFAULT_COLOUR);
        this.name = name;
        this.age = age;
    }

    public void initialize(final int weight, final String colour) {
        initialize(weight, colour, null);
    }

    public void initialize(final int weight, final String colour, final String address) {
        this.age = DEFAULT_AGE;
        this.weight = weight;
        this.colour = colour;
        this.address = address;
    }
}
