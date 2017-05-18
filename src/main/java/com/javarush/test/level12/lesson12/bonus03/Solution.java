package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final int[] data = {1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        final Pair<Integer, Integer> result = getMinimumAndIndex(data);
        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        Pair<Integer, Integer> pair;
        if (array != null && array.length > 0)
        {
            int value = 0;
            int index = 0;
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] < value)
                {
                    value = array[i];
                    index = i;
                }
            }
            pair = new Pair<>(value, index);
        } else {
            pair = new Pair<>(null, null);
        }
        return pair;
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
