package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private String address;
        private String profession;

        public Human(String name, String surname, int age, boolean sex, String address, String profession)
        {
            this(name, surname, address, profession);
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, String address, String profession)
        {
            this(name, surname, address);
            this.profession = profession;
        }

        public Human(String name, String surname, String address)
        {
            this(name, surname);
            this.address = address;
        }

        public Human(String name, String surname)
        {
            this(name);
            this.surname = surname;
        }

        public Human(String name, String surname, int age)
        {
            this(name, surname);
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex)
        {
            this(name, surname, age);
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex)
        {
            this(name, age);
            this.sex = sex;
        }

        public Human(String name, int age)
        {
            this(name);
            this.age = age;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, boolean sex)
        {
            this(name);
            this.sex = sex;
        }

        public String getSurname()
        {
            return surname;
        }

        public void setSurname(String surname)
        {
            this.surname = surname;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getAddress()
        {
            return address;
        }

        public void setAddress(String address)
        {
            this.address = address;
        }

        public boolean isSex()
        {
            return sex;
        }

        public void setSex(boolean sex)
        {
            this.sex = sex;
        }

        public String getProfession()
        {
            return profession;
        }

        public void setProfession(String profession)
        {
            this.profession = profession;
        }
    }
}
