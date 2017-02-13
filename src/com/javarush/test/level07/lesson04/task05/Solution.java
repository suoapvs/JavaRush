package com.javarush.test.level07.lesson04.task05;

import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final int[] bigArray = new int[20];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < bigArray.length; i++)
        {
            bigArray[i] = scanner.nextInt();
        }
        final int[] littleArray1 = new int[10];
        final int[] littleArray2 = new int[10];
        System.arraycopy(bigArray, 0, littleArray1, 0, littleArray1.length);
        System.arraycopy(bigArray, littleArray1.length, littleArray2, 0, littleArray2.length);
        for (int value : littleArray2)
        {
            System.out.println(value);
        }
    }
}
