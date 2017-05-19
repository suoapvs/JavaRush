package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set из котов
 * 1. Внутри класса Solution создать public static класс кот – Cat.
 * 2. Реализовать метод createCats, он должен создавать множество
 * (Set) котов и добавлять в него 3 кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов,
 * которые остались во множестве.
 * Каждый кот с новой строки.
 */
public class Solution {

    public static class Cat {
    }

    public static void main(String[] args) {
        final Set<Cat> cats = createCats();
        final Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext()) {
            cats.remove(iterator.next());
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        final Set<Cat> cats = new HashSet<>();
        final int catsNumber = 3;
        for (int i = 0; i < catsNumber; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(final Set<Cat> cats) {
        cats.forEach(System.out::println);
    }
}
