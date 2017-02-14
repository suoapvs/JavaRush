package com.javarush.test.level16.lesson05.task03;

/* Продвижение на политических дебатах
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/

public class Solution
{
    private static int totalCountSpeeches = 200;
    private static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException
    {
        final Politic ivanov = new Politic("Иванов");
        ivanov.join();
        final Politic petrov = new Politic("Петров");
        final Politic sidorov = new Politic("Сидоров");

        int coutnSpeeches;
        do
        {
            coutnSpeeches = ivanov.getCountSpeaches() +
                    petrov.getCountSpeaches() +
                    sidorov.getCountSpeaches();
        }
        while (coutnSpeeches < totalCountSpeeches);


        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politic extends Thread
    {
        private int countSounds;

        public Politic(final String name)
        {
            super(name);
            start();
        }

        @Override
        public void run()
        {
            final int speeches = totalCountSpeeches * soundsInOneSpeech;
            while (this.countSounds < speeches)
            {
                this.countSounds++;
            }
        }

        public int getCountSpeaches()
        {
            return this.countSounds / soundsInOneSpeech;
        }

        @Override
        public String toString()
        {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeaches());
        }
    }
}
