package com.javarush.test.level05.lesson12.home04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Вывести на экран сегодняшнюю дату
 * Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 */
public class Solution {

    public static void main(String[] args) {
        final DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        final Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
