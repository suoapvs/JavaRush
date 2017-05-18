package com.javarush.test.level14.lesson06.home01;

public final class HenFactory
{
    static Hen getHen(String country)
    {
        Hen hen;
        switch (country)
        {
            case Country.UKRAINE:
                hen = new UkrainianHen();
                break;
            case Country.RUSSIA:
                hen = new RussianHen();
                break;
            case Country.MOLDOVA:
                hen = new MoldovanHen();
                break;
            case Country.BELARUS:
                hen = new BelarusianHen();
                break;
            default:
                hen = null;
        }
        return hen;
    }
}
