package com.javarush.test.level19.lesson05.task02;

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

    public Loader(final String path) {
        this(path, "");
    }

    public Loader(final String path, final String text) {
        this.path = path;
        this.text = text;
    }

    public String read() throws IOException
    {
        try (final RandomAccessFile in = new RandomAccessFile(this.path, "r")) {
            byte[] buffer = new byte[(int) in.length()];
            in.read(buffer);
            return new String(buffer);
        }
    }

    public void write() throws IOException {
        try (final RandomAccessFile out = new RandomAccessFile(this.path, "rw")) {
            out.setLength(0);
            out.write(this.text.getBytes());
        }
    }

    public String getPath() {
        return this.path;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
