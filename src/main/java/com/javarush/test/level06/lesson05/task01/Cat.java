package com.javarush.test.level06.lesson05.task01;

/**
 * Метод finalize класса Cat
 * В классе Cat создать метод protected void finalize() throws Throwable
 */
public class Cat {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat finalized");
    }
}

