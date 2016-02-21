package com.github.vector;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d addVector(Vector3d vector) {
		double a = this.x + vector.x;
		double b = this.y + vector.y;
		double c = this.z + vector.z;

		return new Vector3d(a, b, c);
	}

	public double scalarMultiply(Vector3d vectorOne, Vector3d vectorTwo) {
		double multiply = vectorOne.x * vectorTwo.x + vectorOne.y * vectorTwo.y + vectorOne.z * vectorTwo.z;

		return multiply;
	}

	public Vector3d multiplyVector(Vector3d vector) {
		double a = this.y * vector.z - this.z * vector.y;
		double b = this.z * vector.x - this.x * vector.z;
		double c = this.x * vector.y - this.y * vector.x;
		return new Vector3d(a, b, c);

	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
