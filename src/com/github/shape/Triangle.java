package com.github.shape;

public class Triangle extends Shape {
	private Point x;
	private Point y;
	private Point z;

	public Triangle(Point x, Point y, Point z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point getX() {
		return x;
	}

	public void setX(Point x) {
		this.x = x;
	}

	public Point getY() {
		return y;
	}

	public void setY(Point y) {
		this.y = y;
	}

	public Point getZ() {
		return z;
	}

	public void setZ(Point z) {
		this.z = z;
	}

	private double[] getLength(Point p1, Point p2, Point p3) {
		double[] lengthArray = new double[3];
		lengthArray[0] = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
		lengthArray[1] = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2));
		lengthArray[2] = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2));
		return lengthArray;

	}

	private boolean isTriangle() {
		double[] lengthArray = getLength(x, y, z);
		if ((lengthArray[0] + lengthArray[1] > lengthArray[2]) && (lengthArray[0] + lengthArray[2] > lengthArray[1])
				&& (lengthArray[1] + lengthArray[2] > lengthArray[0])) {
			return true;
		} else
			return false;
	}

	@Override
	double perimetr() {
		if (isTriangle()) {
			double[] lengthArray = getLength(x, y, z);
			return lengthArray[0] + lengthArray[1] + lengthArray[2];
		} else
			return 0;
	}

	@Override
	double area() {
		if (isTriangle()) {
			double[] lengthArray = getLength(x, y, z);
			double p = perimetr() / 2.0;
			return Math.sqrt(p * (p - lengthArray[0]) * (p - lengthArray[1]) * (p - lengthArray[2]));
		} else
			return 0;
	}

	@Override
	public String toString() {
		if (isTriangle()) {
			double[] lengthArray = getLength(x, y, z);
			return "Triangle [" + x + ", " + y + ", " + z + "]" + " or " + "Triangle [x=" + lengthArray[0] + ", y="
					+ lengthArray[1] + ", z=" + lengthArray[2] + "]";
		} else
			return "FAIL IT'S NOT A TRIANGLE!!!";
	}

}
