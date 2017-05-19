package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/**
 * Множество всех животных
 * 1. Внутри класса Solution создать public static классы Cat, Dog.
 * 2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, котороый должен возвращать объединенное множество
 * всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов,
 * которые есть в множестве cats.
 * 6. Реализовать метод printPets, котороый должен выводить на экран всех животных,
 * которые в нем есть.
 * Каждое животное с новой строки
 */
public class Solution {

    public static class Cat {

        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {

        @Override
        public String toString() {
            return "Dog";
        }
    }

    public static void main(String[] args) {
        final Set<Cat> cats = createCats();
        final Set<Dog> dogs = createDogs();
        final Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        final Set<Cat> result = new HashSet<>();
        final int catsNumber = 4;
        for (int i = 0; i < catsNumber; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        final Set<Dog> result = new HashSet<>();
        final int dogsNumber = 3;
        for (int i = 0; i < dogsNumber; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(final Set<Cat> cats, final Set<Dog> dogs) {
        final Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        pets.forEach(System.out::println);
    }
}
