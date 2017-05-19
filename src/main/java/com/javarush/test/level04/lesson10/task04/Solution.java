package com.javarush.test.level04.lesson10.task04;

/**
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final char symbol = 'S';
        final int size = 10;
        final Rectangle rectangle = new Rectangle(symbol, size);
        System.out.println(rectangle.create());
    }

    private static class Rectangle {

        private final static char DEFAULT_SYMBOL = 'S';

        private final char symbol;
        private final int size;

        Rectangle(final int size) {
            this(DEFAULT_SYMBOL, size);
        }

        Rectangle(final char symbol, final int size) {
            this.symbol = symbol;
            this.size = size;
        }

        String create() {
            final StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i++ < this.size) {
                int j = 0;
                while (j++ < this.size) {
                    sb.append(this.symbol);
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
