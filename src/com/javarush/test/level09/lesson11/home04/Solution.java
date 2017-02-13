package com.javarush.test.level09.lesson11.home04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        final Scanner scanner = new Scanner(System.in);
        final Date date = new Date(scanner.nextLine());
        final DateFormat format = new SimpleDateFormat("MMM d, y");
        System.out.println(format.format(date).toUpperCase());
    }
}
