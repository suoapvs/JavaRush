package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            String inputFile = scanner.nextLine();
            String outputFile = scanner.nextLine();
            String inputText = new Loader(inputFile).read();
            String numbers = new Parser(inputText).getNumbers();
            new Loader(outputFile).write(numbers);
            System.out.println(numbers);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
