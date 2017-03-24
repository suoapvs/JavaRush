package com.javarush.test.level18.lesson10.home05;

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
            byte[] buf = new byte[(int) in.length()];
            in.read(buf);
            this.text = new String(buf);
            return this.text;
        }
    }

    public void write() throws IOException {
        try (final RandomAccessFile out = new RandomAccessFile(this.path, "rw")) {
            byte[] buf = this.text.getBytes();
            out.setLength(0);
            out.write(buf);
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
