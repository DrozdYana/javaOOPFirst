package com.github.vector;

public class Runner {

	public static void main(String[] args) {
		Vector vectorOne=new Vector(-1,2,16);
		Vector vectorTwo=new Vector(2,4,10);
		Vector vectorThree=vectorOne.addVector(vectorTwo);
		System.out.println(vectorOne+" + "+vectorTwo+" = "+vectorThree);
		double scalarMultiply=vectorTwo.scalarMultiply(vectorOne,vectorTwo);
		System.out.println(vectorOne+" * "+vectorTwo+" = "+scalarMultiply);
		Vector vectorFour=vectorTwo.multiplyVector(vectorThree);
		System.out.println(vectorTwo+" x "+vectorThree+" = "+vectorFour);

	}

}
