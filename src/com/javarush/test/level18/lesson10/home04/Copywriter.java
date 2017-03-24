package com.javarush.test.level18.lesson10.home04;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Copywriter
{
    private final String outputFileName;
    private final String inputFileName;

    public Copywriter(String outputFileName, String inputFileName)
    {
        this.outputFileName = outputFileName;
        this.inputFileName = inputFileName;
    }

    public void copy() throws IOException
    {
        byte[] bytes = read(inputFileName);
        writeInStartPosition(outputFileName, bytes);
    }

    private static byte[] read(String fileName) throws IOException
    {
        try (RandomAccessFile input = new RandomAccessFile(fileName, "r"))
        {
            byte[] buffer = new byte[(int) input.length()];
            input.read(buffer);
            return buffer;
        }
    }

    private static void writeInStartPosition(String fileName, byte[] bytes) throws IOException
    {
        try (RandomAccessFile output = new RandomAccessFile(fileName, "rw"))
        {
            byte[] buffer = read(fileName);
            output.write(bytes);
            output.write(buffer);
        }
    }

    public String getOutputFileName() {
        return this.outputFileName;
    }

    public String getInputFileName() {
        return this.inputFileName;
    }
}
