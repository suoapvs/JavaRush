package com.javarush.test.level14.lesson08.home09;

public final class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName() {
        return "USD";
    }
}
