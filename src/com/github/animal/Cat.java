package com.github.animal;

public class Cat {
	private String color;
	private double weight;
	private int age;
	private String breed;
	private String name;
	private boolean sex; // true-man; false - woman;

	public Cat(String color, double weight, int age, String breed, String name, boolean sex) {
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.breed = breed;
		this.name = name;
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void play(String name, String toy) {
		System.out.println(name + " play with a " + toy);
	}

	public void fight(Cat cat, boolean readyFirst, boolean readySecond) {
		if (readyFirst && readySecond) {
			if(this.age>cat.age && this.weight>cat.weight){
				System.out.println(this.name+" win!!!");
			}
			else if(this.age<cat.age && this.weight<cat.weight){
				System.out.println(cat.name+" win!!!");
			}
			else
				System.out.println("Friendship win");
			
		} else
			System.out.println("No fight let's play");
	}

	public void playTogether(Cat cat, String toy) {
		System.out.println(this.name + " play with " + cat.name + " and they have a " + toy);
	}

	@Override
	public String toString() {
		String str;
		if (sex == true) {
			str = "man";
		} else {
			str = "woman";
		}
		return "[name=" + name + ", color=" + color + ", weight=" + weight + ", age=" + age + ", breed=" + breed
				+ ", sex=" + str + "]";

	}

}
