package com.company;

public class Human extends Humanoid {
    public Human()
    {
        drinking=new DrinkingCuzNormal();
    }

    @Override
    public void scream() {
        super.scream();
    }
}
