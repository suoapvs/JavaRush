package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("grandfather1", true, 70, null, null);
        Human grandmother1 = new Human("grandmother1", false, 67, null, null);

        Human grandfather2 = new Human("grandfather2", true, 74, null, null);
        Human grandmother2 = new Human("grandmother2", false, 71, null, null);

        Human father = new Human("father", true, 40, grandfather1, grandmother1);
        Human mother = new Human("mother", false, 38, grandfather2, grandmother2);

        Human child1 = new Human("child1", true, 25, father, mother);
        Human child2 = new Human("child2", false, 19, father, mother);
        Human child3 = new Human("child3", true, 17, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public boolean isSex()
        {
            return sex;
        }

        public void setSex(boolean sex)
        {
            this.sex = sex;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public Human getFather()
        {
            return father;
        }

        public void setFather(Human father)
        {
            this.father = father;
        }

        public Human getMother()
        {
            return mother;
        }

        public void setMother(Human mother)
        {
            this.mother = mother;
        }
    }

}
