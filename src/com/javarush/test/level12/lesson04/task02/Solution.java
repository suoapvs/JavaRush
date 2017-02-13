package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(21);
        print((Integer) 85);
    }

    static void print(int a) {
        System.out.print("int " + a);
    }
    static void print(Integer a) {
        System.out.print("Integer " + a);
    }
}
