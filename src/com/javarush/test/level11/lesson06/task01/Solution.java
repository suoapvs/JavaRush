package com.javarush.test.level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Horse
    {
        private String name;

        public Horse(final String name)
        {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }
    }

    public class Pegas extends Horse
    {
        public Pegas(final String name)
        {
            super(name);
        }
    }
}
