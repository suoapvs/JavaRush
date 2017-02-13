package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;

    public BodyPart attack()
    {
        return getBodyPart();
    }

    public BodyPart defense()
    {
        return getBodyPart();
    }

    private static BodyPart getBodyPart()
    {
        BodyPart bodyPart;
        switch (++hitCount)
        {
            case 1:
                bodyPart = BodyPart.HEAD;
                break;
            case 2:
                bodyPart = BodyPart.LEG;
                break;
            case 3:
                bodyPart = BodyPart.ARM;
                hitCount = 0;
                break;
            case 4:
                bodyPart = BodyPart.CHEST;
                break;
            default:
                bodyPart = null;
        }
        return bodyPart;
    }
}
