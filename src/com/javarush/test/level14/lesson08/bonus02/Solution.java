package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final int b = scan.nextInt();
        int nod = getNod(a, b);
        System.out.println(nod);
    }

    private static int getNod(int a, int b) {
        int nod = -1;
        for (int i = minAbs(a, b); i > 0; i--)
        {
            if ((a % i == 0) && (b % i == 0))
            {
                nod = i;
                break;
            }
        }
        return nod;
    }

    private static int minAbs(int a, int b) {
        int aAbs = Math.abs(a);
        int bAbs = Math.abs(b);
        return aAbs < bAbs ? aAbs : bAbs;
    }
}
