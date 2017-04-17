package com.javarush.test.level19.lesson05.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Parser
{
    private String text;

    public Parser(String text)
    {
        this.text = text;
    }

    public String getNumbers()
    {
        StringBuilder sb = new StringBuilder();
        for (String word : text.split(" "))
        {
            try
            {
                sb.append(Integer.parseInt(word)).append(" ");
            }
            catch (NumberFormatException ex)
            {
                ex.printStackTrace();
            }
        }
        return sb.toString();
    }
}
