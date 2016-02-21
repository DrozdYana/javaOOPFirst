package com.github.animal;

public class Runner {
	public static void main(String[] args) {
		Cat cat = new Cat("foxy", 4.5, 3, "Street Cat", "Mark", true);
		String name = cat.getName();
		System.out.println(cat);
		cat.play(name, "ball");
		Cat catTwo = new Cat("grey", 3, 2, "Street Cat", "Vaska", true);
		System.out.println(catTwo);
		cat.fight(catTwo, true, true);
		cat.playTogether(catTwo, "mouse toy");

	}
}
