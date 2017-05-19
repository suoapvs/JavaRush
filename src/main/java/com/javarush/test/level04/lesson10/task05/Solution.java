package com.javarush.test.level04.lesson10.task05;

/**
 * Таблица умножения
 * Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
 * 1 2 3 4 5 6 7 8 9 10
 * 2 4 6 8 10 12 14 16 18 20
 * ...
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final int number = 10;
        final MultiplicationTable multiplicationTable = new MultiplicationTable(number);
        System.out.println(multiplicationTable.create());
    }

    private static class MultiplicationTable {

        private final int number;

        MultiplicationTable(final int number) {
            this.number = number;
        }

        String create() {
            final StringBuilder sb = new StringBuilder();
            int i = 0;
            while (++i <= this.number) {
                int j = 0;
                while (++j <= this.number) {
                    sb.append(i * j);
                    if (j < this.number) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
