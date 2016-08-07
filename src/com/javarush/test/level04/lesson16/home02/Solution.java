package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(method(a, b, c));
    }

    public static int method(int a,int b, int c){
        if((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else {
            return method(b, c, a);
        }
    }
}
