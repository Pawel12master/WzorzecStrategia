package com.company;

public abstract class Humanoid {

    Drinking drinking;
    Eating eating;
    public void scream()
    {
        System.out.println("I am human");
    }
    public void makeDrink()
    {
        drinking.drink();
    }

    public void setDrinking(Drinking drinking) {
        this.drinking = drinking;
    }

    public void setEating(Eating eating) {
        this.eating = eating;
    }
}
