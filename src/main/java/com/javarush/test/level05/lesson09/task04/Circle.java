package com.javarush.test.level05.lesson09.task04;

/**
 * Создать класс Circle
 * Создать класс (Circle) круг, с тремя конструкторами:
 * - centerX, centerY, radius
 * - centerX, centerY, radius, width
 * - centerX, centerY, radius  width, color
 */
public class Circle {

    private final static String DEFAULT_COLOR = "white";

    private final int centerX;
    private final int centerY;
    private final int radius;
    private final int width;
    private final String color;

    public Circle(int centerX, int centerY, int radius) {
        this(centerX, centerY, radius, 0);
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this(centerX, centerY, radius, width, DEFAULT_COLOR);
    }

    public Circle(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
