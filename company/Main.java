package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Humanoid humanoid=new Human();
        humanoid.scream();
        humanoid.makeDrink();
        humanoid.setDrinking(new DrinkingCuzVampire());
        humanoid.makeDrink();

    }
}
