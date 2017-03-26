package com.javarush.test.level19.lesson05.task01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Loader
{
    private final String path;
    private byte[] bytes;

    public Loader(final String path) {
        this(path, new byte[0]);
    }

    public Loader(final String path, final byte[] bytes) {
        this.path = path;
        this.bytes = bytes;
    }

    public byte[] read() throws IOException
    {
        try (final RandomAccessFile in = new RandomAccessFile(this.path, "r")) {
            byte[] buffer = new byte[(int) in.length()];
            in.read(buffer);
            return buffer;
        }
    }

    public void write() throws IOException {
        try (final RandomAccessFile out = new RandomAccessFile(this.path, "rw")) {
            out.setLength(0);
            out.write(bytes);
        }
    }

    public String getPath() {
        return this.path;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public void setBytes(final byte[] bytes) {
        this.bytes = bytes;
    }
}
