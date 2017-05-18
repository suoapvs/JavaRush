package com.javarush.test.level19.lesson05.task03;

import java.io.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Loader
{
    private final String path;

    public Loader(final String path)
    {
        this.path = path;
    }

    public String read() throws IOException
    {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path)))
        {
            String str;
            while ((str = reader.readLine()) != null)
            {
                sb.append(str);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public void write(String text) throws IOException
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.path)))
        {
            writer.write(text);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public String getPath()
    {
        return this.path;
    }
}
