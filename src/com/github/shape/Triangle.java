package com.github.shape;

public class Triangle extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	private boolean isTriangle() {

		if ((p1.getLength(p1, p2) + p1.getLength(p2, p3) > p1.getLength(p1, p3))
				&& (p1.getLength(p1, p2) + p1.getLength(p1, p3) > p1.getLength(p2, p3))
				&& (p1.getLength(p2, p3) + p1.getLength(p1, p3) > p1.getLength(p1, p2))) {
			return true;
		} else
			return false;
	}

	@Override
	double perimetr() {
		if (isTriangle()) {

			return p1.getLength(p1, p2) + p1.getLength(p2, p3) + p1.getLength(p1, p3);
		} else
			return 0;
	}

	@Override
	double area() {
		if (isTriangle()) {
			double p = perimetr() / 2.0;
			return Math.sqrt(p * (p - p1.getLength(p1, p2)) * (p - p1.getLength(p2, p3)) * (p - p1.getLength(p1, p3)));
		} else
			return 0;
	}

	@Override
	public String toString() {
		if (isTriangle()) {
			return "Triangle [" + p1 + ", " + p2 + ", " + p3 + "]" + " with length [x=" + p1.formatDouble(p1.getLength(p1, p2))
					+ ", y=" + p1.formatDouble(p1.getLength(p2, p3)) + ", z=" + p1.formatDouble(p1.getLength(p1, p3)) + "]";
		} else
			return "FAIL IT'S NOT A TRIANGLE!!!";
	}
	

}
