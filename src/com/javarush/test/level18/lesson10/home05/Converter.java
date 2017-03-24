package com.javarush.test.level18.lesson10.home05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Converter
{
    private final List<Double> doubles;
    private List<Integer> integers;

    public Converter(final List<Double> doubles) {
        this.doubles = doubles;
    }

    public List<Double> getDoubles() {
        return this.doubles;
    }

    public List<Integer> getIntegers() {
        if (this.integers == null) {
            convertDoublesToIntegers();
        }
        return this.integers;
    }

    private void convertDoublesToIntegers() {
        this.integers = new ArrayList<>();
        for (Double number : this.doubles) {
            this.integers.add(convertToInteger(number));
        }
    }

    private static Integer convertToInteger(Double number) {
        return number.intValue();
    }
}
