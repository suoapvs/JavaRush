package com.javarush.test.level06.lesson11.bonus02;

import java.io.IOException;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final Scanner scanner = new Scanner(System.in);
        final Cat grandfather = new Cat(scanner.nextLine());
        final Cat grandmother = new Cat(scanner.nextLine());
        final Cat father = new Cat(scanner.nextLine(), grandfather, null);
        final Cat mother = new Cat(scanner.nextLine(), null, grandmother);
        final Cat son = new Cat(scanner.nextLine(), father, mother);
        final Cat daughter = new Cat(scanner.nextLine(), father, mother);
        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(final String name)
        {
            this.name = name;
        }

        Cat(final String name, final Cat father, final Cat mother)
        {
            this(name);
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            return ("Cat name is " + this.name) +
                    (this.mother != null ? ", mother is " + this.mother.name : ", no mother") +
                    (this.father != null ? ", father is " + this.father.name : ", no father");
        }
    }
}
