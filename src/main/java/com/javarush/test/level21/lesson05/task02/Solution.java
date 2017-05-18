package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution
{
    private final String first, last;

    public Solution(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Solution solution = (Solution) o;
        if (this.first != null ? !this.first.equals(solution.first) : solution.first != null) return false;
        if (this.last != null ? !this.last.equals(solution.last) : solution.last != null) return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = this.first != null ? this.first.hashCode() : 0;
        result = 31 * result + (this.last != null ? this.last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args)
    {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
