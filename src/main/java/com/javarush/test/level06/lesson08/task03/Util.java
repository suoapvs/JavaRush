package com.javarush.test.level06.lesson08.task03;

/**
 * Класс Util
 * Реализовать статический метод double getDistance(x1, y1, x2, y2).
 * Он должен вычислять расстояние между точками.
 * Используй метод double Math.sqrt(double a),
 * который вычисляет квадратный корень переданного параметра
 */
public class Util {

    public static double getDistance(final int x1, final int y1, final int x2, final int y2) {
        final int x = x2 - x1;
        final int y = y2 - y1;
        return Math.sqrt(x * x + y * y);
    }
}
