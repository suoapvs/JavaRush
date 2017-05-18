package com.javarush.test.level07.lesson12.home02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add("s " + i);
        }
        for(int i = 0; i < m; i++){
            list.add(list.remove(0));
        }
        for (String line : list) {
            System.out.println(line);
        }
    }
}
