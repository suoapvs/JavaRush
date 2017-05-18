package com.javarush.test.level08.lesson11.bonus02;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final Scanner scanner = new Scanner(System.in);
        final Map<String, String> map = new HashMap<>();
        String city;
        String surname;
        while (true)
        {
            city = scanner.nextLine();
            if (city.isEmpty())
            {
                break;
            } else
            {
                surname = scanner.nextLine();
                map.put(city, surname);
            }
        }
        System.out.println(
                map.get(scanner.nextLine())
        );
    }
}

