package com.javarush.test.level04.lesson13.task02;

import java.util.Scanner;

/**
 * Рисуем прямоугольник
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int m = scanner.nextInt();
        final int n = scanner.nextInt();
        final Rectangle rectangle = new Rectangle(m, n);
        System.out.println(rectangle.create());
    }

    private static class Rectangle {

        private final static char DEFAULT_SYMBOL = '8';

        private final char symbol;
        private final int height;
        private final int width;

        Rectangle(final int height, final int width) {
            this(DEFAULT_SYMBOL, height, width);
        }

        Rectangle(final char symbol, final int height, final int width) {
            this.symbol = symbol;
            this.height = height;
            this.width = width;
        }

        String create() {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    sb.append(this.symbol);
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
