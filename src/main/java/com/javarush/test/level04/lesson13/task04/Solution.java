package com.javarush.test.level04.lesson13.task04;

/**
 * Рисуем линии
 * Используя цикл for вывести на экран:
 * -	горизонтальную линию из 10 восьмёрок
 * -	вертикальную линию из 10 восьмёрок.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int length = 10;
        final Line line = new Line(length);
        System.out.println(line.createHorizontal());
        System.out.println(line.createVertical());
    }

    private static class Line {

        private final static char DEFAULT_SYMBOL = '8';

        private final char symbol;
        private final int length;

        Line(final int length) {
            this(DEFAULT_SYMBOL, length);
        }

        Line(final char symbol, final int length) {
            this.symbol = symbol;
            this.length = length;
        }

        String createHorizontal() {
            return create(false);
        }

        String createVertical() {
            return create(true);
        }

        private String create(final boolean isVertical) {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.length; i++) {
                sb.append(this.symbol);
                if (isVertical) {
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
    }
}
