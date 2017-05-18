package com.javarush.test.level14.lesson06.home01;

public final class RussianHen extends Hen
{
    private int countOfEggsPerMonth;

    public RussianHen()
    {
        this.countOfEggsPerMonth = 5;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() +
                " Моя страна - " + Country.RUSSIA +
                ". Я несу " + this.countOfEggsPerMonth + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }
}
