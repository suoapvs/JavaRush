package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Люди с одинаковыми именами и/или фамилиями
 * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 * 4. Вывести содержимое Map на экран.
 */
public class Solution {

    private static final Random RANDOM = new Random();

    private static final String[] NAMES = { "Alex", "Petr", "Anna", "Yurii", "Oksana" };
    private static final String[] SURNAMES = { "Petrovski", "Smith", "Irma", "Favn", "Qvair" };

    public static void main(String[] args) {
        final int peopleNumber = 10;
        final Map<String, String> people = createRandomPeople(peopleNumber);
        printPeopleList(people);
    }

    public static Map<String, String> createRandomPeople(final int peopleNumber) {
        final Map<String, String> people = new HashMap<>();
        for (int i = 0; i < peopleNumber; i++) {
            people.put(
                    getRandomLine(NAMES),
                    getRandomLine(SURNAMES)
            );
        }
        return people;
    }

    public static void printPeopleList(final Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static String getRandomLine(final String[] lines) {
        final int index = RANDOM.nextInt(lines.length);
        return lines[index];
    }
}
