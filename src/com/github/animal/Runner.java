package com.github.animal;

public class Runner {
	public static void main(String[] args) {
		Cat cat = new Cat("foxy", 4.5, 2, "Street Cat", "Mark", true);
		String name = cat.getName();
		System.out.println(cat);
		cat.play(name, "ball");
		Cat catTwo = new Cat("grey", 3, 2, "Street Cat", "Vaska", true);
		System.out.println(catTwo);
		boolean fight = cat.fight(cat, catTwo, false, true);
		if (fight == true) {
			System.out.println("Let's fight");
		} else
			System.out.println("No Fight, Let's play");
		cat.playTogether(name, catTwo.getName(), "mouse toy");

	}
}
