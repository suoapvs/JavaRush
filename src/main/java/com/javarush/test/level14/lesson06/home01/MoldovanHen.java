package com.javarush.test.level14.lesson06.home01;

public final class MoldovanHen extends Hen
{
    private int countOfEggsPerMonth;

    public MoldovanHen()
    {
        this.countOfEggsPerMonth = 15;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() +
                " Моя страна - " + Country.MOLDOVA +
                ". Я несу " + this.countOfEggsPerMonth + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }
}
