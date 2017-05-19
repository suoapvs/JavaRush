package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap из 10 пар
 * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
 * арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень,
 * земляника – ягода, ирис – цветок, картофель – клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Пример вывода (тут показана только одна строка):
 * картофель – овощ
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        final Map<String, String> plants = new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");
        println(plants);
    }

    private static void println(final Map<String, String> plants) {
        for (Map.Entry<String, String> entry : plants.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
