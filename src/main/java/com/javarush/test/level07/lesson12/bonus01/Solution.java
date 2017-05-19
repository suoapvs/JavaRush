package com.javarush.test.level07.lesson12.bonus01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Нужно исправить программу, чтобы компилировалась и работала
 * Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
 * Cat name is Barsik, age is 6, weight is 5, tail = 22
 * Cat name is Murka, age is 8, weight is 7, tail = 20
 */
public class Solution {

    private final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int age = scanner.nextInt();
            int weight = scanner.nextInt();
            int tailLength = scanner.nextInt();
            CATS.add(new Cat(name, age, weight, tailLength));
        }
        printList();
    }

    private static void printList() {
        CATS.forEach(System.out::println);
    }

    public static class Cat {
        private final String name;
        private final int age;
        private final int weight;
        private final int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat name is " +this. name +
                    ", age is " + this.age +
                    ", weight is " + this.weight +
                    ", tail = " + this.tailLength;
        }
    }
}
