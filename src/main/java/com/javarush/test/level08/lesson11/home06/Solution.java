package com.javarush.test.level08.lesson11.home06;

import java.util.ArrayList;
import java.util.List;

/**
 * Вся семья в сборе
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Вывести все объекты Human на экран.
 */
public class Solution {

    public static void main(String[] args) {
        Human child1 = new Human("child1", true, 13, null);
        Human child2 = new Human("child2", false, 18, null);
        Human child3 = new Human("child3", true, 16, null);

        List<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("father", true, 40, children);
        Human mother = new Human("mother", false, 37, children);

        List<Human> fatherList = new ArrayList<>();
        fatherList.add(father);

        List<Human> motherList = new ArrayList<>();
        motherList.add(mother);

        Human grandfather1 = new Human("grandfather1", true, 67, fatherList);
        Human grandmother1 = new Human("grandmother1", false, 65, fatherList);

        Human grandfather2 = new Human("grandfather2", true, 70, motherList);
        Human grandmother2 = new Human("grandmother2", false, 69, motherList);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
    }

    public static class Human {
        private final String name;
        private final boolean sex;
        private final int age;

        private List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children != null) {
                this.children = children;
            }
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Имя: ").append(this.name)
                    .append(", пол: ").append(this.sex ? "мужской" : "женский")
                    .append(", возраст: ").append(this.age);
            if (!this.children.isEmpty()) {
                sb.append(", дети: ");
                for (Human child : this.children) {
                    sb.append(child.getName()).append(", ");
                }
            }
            return sb.toString();
        }

        public String getName() {
            return name;
        }


        public boolean isSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public List<Human> getChildren() {
            return children;
        }

        public void setChildren(final List<Human> children) {
            this.children = children;
        }
    }

}
