package com.javarush.test.level19.lesson05.task04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Loader
{
    private final String path;
    private String text;

    public Loader(final String path)
    {
        this(path, "");
    }

    public Loader(final String path, final String text)
    {
        this.path = path;
        this.text = text;
    }

    public String read() throws IOException
    {
        try (final RandomAccessFile input = new RandomAccessFile(path, "r"))
        {
            byte[] buf = new byte[(int) input.length()];
            input.read(buf);
            this.text = new String(buf);
            return this.text;
        }
    }

    public void write() throws IOException
    {
        try (final RandomAccessFile output = new RandomAccessFile(path, "rw"))
        {
            byte[] buf = text.getBytes();
            output.setLength(0);
            output.write(buf);
        }
    }

    public String getPath()
    {
        return this.path;
    }

    public String getText()
    {
        return this.text;
    }

    public void setText(final String text)
    {
        this.text = text;
    }
}
