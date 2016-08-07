package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        String temp;

        while (true) {
            temp = in.next();
            if (temp.equals("сумма")) {
                break;
            } else {
                sum += Integer.parseInt(temp);
            }
        }

        System.out.println(sum);
    }
}
