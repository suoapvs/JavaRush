package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("child1", true, 13, null);
        Human child2 = new Human("child2", false, 18, null);
        Human child3 = new Human("child3", true, 16, null);

        List<Human> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("father", true, 40, childs);
        Human mother = new Human("mother", false, 37, childs);

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

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;

        private List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children != null)
            {
                this.children = children;
            }
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

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

        public List<Human> getChildren()
        {
            return children;
        }

        public void setChildren(List<Human> children)
        {
            this.children = children;
        }
    }

}
