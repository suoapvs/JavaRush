package com.javarush.test.level14.lesson06.home01;

public final class UkrainianHen extends Hen
{
    private int countOfEggsPerMonth;

    public UkrainianHen()
    {
        this.countOfEggsPerMonth = 100;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() +
                " Моя страна - " + Country.UKRAINE +
                ". Я несу " + this.countOfEggsPerMonth + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }
}
