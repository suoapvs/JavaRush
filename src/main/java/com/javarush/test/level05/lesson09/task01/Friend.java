package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private int age;
    private boolean gender;

    public Friend(final String name)
    {
        this.name = name;
    }

    public Friend(final String name, final int age)
    {
        this(name);
        this.age = age;
    }

    public Friend(final String name, final int age, final boolean gender)
    {
        this(name, age);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}