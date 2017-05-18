package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }
        list = fix(list);
        for (String string : list)
        {
            System.out.println(string);
        }
    }

    public static List<String> fix(final List<String> list)
    {
        for (int i = 0 ; i < list.size(); i++) {
            String line = list.get(i);
            if (line.contains("р") && line.contains("л")) {
                continue;
            }
            if (line.contains("р")) {
                list.remove(i--);
            } else if (line.contains("л")) {
                list.add(i++, line);
            }
        }
        return list;
    }
}