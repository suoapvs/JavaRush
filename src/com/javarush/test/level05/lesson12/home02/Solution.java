package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Vasya", 20, "Some address 1");
        Man man2 = new Man("Petya", 25, "Some address 2");
        Woman woman1 = new Woman("Oksana", 22, "Some address 3");
        Woman woman2 = new Woman("Anna", 18, "Some address 4");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man
    {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    /*
    // ЭТОТ КОД НЕ ПРОХОДИТ ТЕСТИРОВАНИЕ
    public static void main(String[] args)
    {
        Man man1 = new Man("Vasya", 20, "Some address 1");
        Man man2 = new Man("Petya", 25, "Some address 2");
        Woman woman1 = new Woman("Oksana", 22, "Some address 3");
        Woman woman2 = new Woman("Anna", 18, "Some address 4");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Human {
        protected String name;
        protected int age;
        protected String address;

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Man extends Human {

        public Man(String name, int age, String address) {
            super(name, age, address);
        }
    }

    public static class Woman extends Human {

        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }*/
}
