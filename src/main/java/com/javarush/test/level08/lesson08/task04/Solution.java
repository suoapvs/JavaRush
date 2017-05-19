package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Удалить всех людей, родившихся летом
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Solution {

    public static void main(String[] args) {
        final HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }

    public static HashMap<String, Date> createMap() {
        final HashMap<String, Date> map = new HashMap<>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Брюс Ли", new Date("APRIL 1 1970"));
        map.put("Джекки Чан", new Date("SEPTEMBER 1 1980"));
        map.put("Шварцнегер", new Date("AUGUST 1 1960"));
        map.put("Ван Дам", new Date("JULY 1 1986"));
        map.put("Чак Норрис", new Date("OCTOBER 1 1955"));
        map.put("Стэтхем", new Date("DECEMBER 1 1967"));
        map.put("Брюс Уиллис", new Date("MAY 1 1954"));
        map.put("Дольф Лунгрен", new Date("NOVEMBER 1 1967"));
        map.put("Стивен Сигал", new Date("DECEMBER 2 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        final Map<String, Date> temp = new HashMap<>(map);
        temp.entrySet().stream()
                .filter(entry -> isSummerDate(entry.getValue()))
                .forEach(entry -> map.remove(entry.getKey()));
    }

    private static boolean isSummerDate(final Date date) {
        return (date.getMonth() >= 5) && (date.getMonth() <= 7);
    }
}
