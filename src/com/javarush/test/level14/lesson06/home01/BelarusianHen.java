package com.javarush.test.level14.lesson06.home01;

public final class BelarusianHen extends Hen
{
    private int countOfEggsPerMonth;

    public BelarusianHen()
    {
        this.countOfEggsPerMonth = 10;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() +
                " Моя страна - " + Country.BELARUS +
                ". Я несу " + this.countOfEggsPerMonth + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }
}
