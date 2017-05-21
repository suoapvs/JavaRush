package com.javarush.test.level10.lesson11.home04;

/**
 * Большая зарплата
 * Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
 * Образец:
 * Я не хочу изучать Java, я хочу большую зарплату
 * не хочу изучать Java, я хочу большую зарплату
 * не хочу изучать Java, я хочу большую зарплату
 * е хочу изучать Java, я хочу большую зарплату
 * хочу изучать Java, я хочу большую зарплату
 * хочу изучать Java, я хочу большую зарплату
 * …
 */
public class Solution {

    public static void main(String[] args) {
        final String message = "Я не хочу изучать Java, я хочу большую зарплату";
        final int number = 40;
        substringAndPrintln(message, number);
    }

    private static void substringAndPrintln(final String line, final int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(line.substring(i));
        }
    }
}
