package com.javarush.test.level05.lesson05.task02;

/**
 * Реализовать метод fight
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 * Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
 * т.е. возвращать true, если выиграли и false - если нет.
 * Должно выполняться условие:
 * если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
 */
public class Cat {

    private final String name;
    private final int age;
    private final int weight;
    private final int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(final Cat anotherCat) {
        int score = this.isStronger(anotherCat) ? 1 : -1;
        score += this.isWeighter(anotherCat) ? 1 : -1;
        score += this.isYounger(anotherCat) ? 1 : -1;
        return (score > 0);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getStrength() {
        return this.strength;
    }

    private boolean isStronger(final Cat anotherCat) {
        return (this.strength > anotherCat.strength);
    }

    private boolean isWeighter(final Cat anotherCat) {
        return (this.weight > anotherCat.weight);
    }

    private boolean isYounger(final Cat anotherCat) {
        return (this.age < anotherCat.age);
    }
}

