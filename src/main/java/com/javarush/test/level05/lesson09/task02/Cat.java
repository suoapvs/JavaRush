package com.javarush.test.level05.lesson09.task02;

/**
 * Создать класс Cat
 * Создать класс Cat (кот) с пятью конструкторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
 * - вес, цвет, адрес (чужой домашний кот)
 * Задача инициализатора – сделать объект валидным.
 * Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить. То же касательно возраста.
 * А вот имени может и не быть (null). То же касается адреса: null.
 */
public class Cat {

    private final static int DEFAULT_WEIGHT = 5;
    private final static int DEFAULT_AGE = 3;

    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(final String name) {
        this(name, DEFAULT_WEIGHT, DEFAULT_AGE);
    }

    public Cat(final String name, final int weight, final int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(final String name, final int age) {
        this(name, DEFAULT_WEIGHT, age);
    }

    public Cat(final int weight, final String color) {
        this(null, weight, DEFAULT_AGE);
        this.color = color;
    }

    public Cat(final int weight, final String color, final String address) {
        this(weight, color);
        this.address = address;
    }
}
