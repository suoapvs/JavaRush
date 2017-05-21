package com.javarush.test.level10.lesson11.home06;

/**
 * Конструкторы класса Human
 * Напиши класс Human с 6 полями.
 * Придумай и реализуй 10 различных конструкторов для него.
 * Каждый конструктор должен иметь смысл.
 */
public class Solution {

    public static void main(String[] args) {

    }

    public static class Human {

        private final String name;
        private final String surname;
        private final int age;
        private final boolean sex;
        private final String address;
        private final String profession;

        public Human(String name, String surname, int age, boolean sex, String address, String profession) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.profession = profession;
        }

        public Human(String name, String surname, String address, String profession) {
            this(name, surname, 0, false, address, profession);
        }

        public Human(String name, String surname, String address) {
            this(name, surname, address, "");
        }

        public Human(String name, String surname) {
            this(name, surname, "");
        }

        public Human(String name, String surname, int age, boolean sex) {
            this(name, surname, age, sex, "", "");
        }

        public Human(String name, String surname, int age) {
            this(name, surname, age, false);
        }

        public Human(String name, int age, boolean sex) {
            this(name, "", age, sex);
        }

        public Human(String name, int age) {
            this(name, age, false);
        }

        public Human(String name) {
            this(name, 0);
        }

        public Human(String name, boolean sex) {
            this(name, "", 0, sex);
        }

        public String getSurname() {
            return surname;
        }


        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public boolean isSex() {
            return sex;
        }

        public String getProfession() {
            return profession;
        }
    }
}
