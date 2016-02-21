package com.github.triangle;

public class Runner {

	public static void main(String[] args) {
		Triangle triangleOne = new Triangle(1, 0, 1);
		Triangle triangleTwo = new Triangle(5, 7, 10);
		double a1 = triangleOne.getA();
		double b1 = triangleOne.getB();
		double c1 = triangleOne.getC();
		double squarOne = triangleOne.getSquare(a1, b1, c1);
		double a2 = triangleTwo.getA();
		double b2 = triangleTwo.getB();
		double c2 = triangleTwo.getC();
		double squareTwo = triangleTwo.getSquare(a2, b2, c2);
		System.out.println(triangleOne + " squarOne=" + squarOne + "\n" + triangleTwo + " squarTwo=" + squareTwo);
		triangleOne.setB(1);
		double a3 = triangleOne.getA();
		double b3 = triangleOne.getB();
		double c3 = triangleOne.getC();
		double squarOneNew=triangleOne.getSquare(a3, b3, c3);
		System.out.println(triangleOne+" squarOneNew=" + squarOneNew);
	}

}
