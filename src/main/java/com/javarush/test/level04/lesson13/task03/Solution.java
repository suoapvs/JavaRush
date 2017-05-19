package com.javarush.test.level04.lesson13.task03;

/**
 * Рисуем треугольник
 * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * Пример:
 * 8
 * 88
 * 888
 * ...
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int size = 10;
        final Triangle triangle = new Triangle(size);
        System.out.println(triangle.create());
    }

    private static class Triangle {

        private final static char DEFAULT_SYMBOL = '8';

        private final char symbol;
        private final int size;

        Triangle(final int size) {
            this(DEFAULT_SYMBOL, size);
        }

        Triangle(final char symbol, final int size) {
            this.symbol = symbol;
            this.size = size;
        }

        String create() {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append(this.symbol);
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
