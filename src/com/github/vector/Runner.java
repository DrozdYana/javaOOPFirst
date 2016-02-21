package com.github.vector;

public class Runner {

	public static void main(String[] args) {
		Vector3d vectorOne=new Vector3d(-1,2,16);
		Vector3d vectorTwo=new Vector3d(2,4,10);
		Vector3d vectorThree=vectorOne.addVector(vectorTwo);
		System.out.println(vectorOne+" + "+vectorTwo+" = "+vectorThree);
		double scalarMultiply=vectorTwo.scalarMultiply(vectorOne,vectorTwo);
		System.out.println(vectorOne+" * "+vectorTwo+" = "+scalarMultiply);
		Vector3d vectorFour=vectorTwo.multiplyVector(vectorThree);
		System.out.println(vectorTwo+" x "+vectorThree+" = "+vectorFour);

	}

}
