package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/**
 * Работа с датой
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 * если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате MAY 1 2013
 * Не забудьте учесть первый день года.
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 */
public class Solution {

    public static void main(String[] args) {
    }

    public static boolean isDateOdd(final String date) {
        final Date dates = new Date(date);
        long finish = dates.getTime();
        dates.setDate(1);
        dates.setMonth(0);
        final long start = dates.getTime();
        final long dif = finish - start;
        final long msDay = 1000 * 60 * 60 * 24;
        final int dayCount = (int) (dif / msDay);
        return dayCount % 2 == 0;
    }
}
