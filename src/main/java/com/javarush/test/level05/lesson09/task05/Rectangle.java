package com.javarush.test.level05.lesson09.task05;

/**
 * Создать класс прямоугольник (Rectangle).
 * Его данными будут top, left, width, height
 * (левая координата, верхняя, ширина и высота).
 * Создать для него как можно больше конструкторов:
 * Примеры:
 * -	заданы 4 параметра: left, top, width, height
 * -	ширина/высота не задана (оба равны 0)
 * -	высота не задана (равно ширине) создаём квадрат
 * -	создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Rectangle {

    private final int left;
    private final int top;
    private final int width;
    private final int height;

    public Rectangle(int left, int top) {
        this(left, top, 0);
    }

    public Rectangle(int left, int top, int width) {
        this(left, top, width, width);
    }

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(final Rectangle another) {
        this(another.left, another.top, another.width, another.height);
    }
}
