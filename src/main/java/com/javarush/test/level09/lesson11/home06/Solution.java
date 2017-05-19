package com.javarush.test.level09.lesson11.home06;

import java.util.ArrayList;

/**
 * Сказка «Красная Шапочка»
 * 1. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
 * 2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
 * 3. Необходимые объекты созданы (hood, grandmother, ...).
 * 4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки «Красная Шапочка».
 * PS: пирожки никто не ел. Их только несли. Волк чуток поел. А его потом убили.
 */
public class Solution {

    private static LittleRedRidingHood hood = new LittleRedRidingHood();
    private static Grandmother grandmother = new Grandmother();
    private static Patty patty = new Patty();
    private static Woodman woodman = new Woodman();
    private static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }

    //красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    public static class Grandmother extends StoryItem {
    }

    //пирожок
    public static class Patty extends StoryItem {
    }

    //дровосек
    public static class Woodman extends StoryItem {
    }

    //волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {

        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
