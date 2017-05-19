package com.javarush.test.level08.lesson11.bonus02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Нужно добавить в программу новую функциональность
 * Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
 * Новая задача: Программа должна работать не с номерами домов, а с городами:
 * Пример ввода:
 * Москва
 * Ивановы
 * Киев
 * Петровы
 * Лондон
 * Абрамовичи
 * <p>
 * Лондон
 * <p>
 * Пример вывода:
 * Абрамовичи
 */
public class Solution {

    public static void main(String[] args) {
        final Map<String, String> map = createMap();
        scanAndSearch(map);
    }

    private static Map<String, String> createMap() {
        final Map<String, String> map = new HashMap<>();
        final Scanner scanner = new Scanner(System.in);
        String city;
        String surname;
        while (true) {
            city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            } else {
                surname = scanner.nextLine();
                map.put(city, surname);
            }
        }
        return map;
    }

    private static void scanAndSearch(final Map<String, String> map) {
        final Scanner scanner = new Scanner(System.in);
        String city;
        while (true) {
            city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            } else {
                System.out.println(map.get(city));
            }
        }
    }
}

