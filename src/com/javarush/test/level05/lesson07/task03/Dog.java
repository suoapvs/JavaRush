package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int height;
    private String colour;

    public void initialize(final String name)
    {
        this.name = name;
    }

    public void initialize(final String name, int height)
    {
        initialize(name);
        this.height = height;
    }

    public void initialize(final String name, final int height, final String colour)
    {
        initialize(name, height);
        this.colour = colour;
    }
}
