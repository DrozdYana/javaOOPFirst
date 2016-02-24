package com.github.shape;

public class Circle extends Shape {
	private Point p1Center;
	private Point p2;

	public Circle(Point p1Center, Point p2) {
		super();
		this.p1Center = p1Center;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1Center;
	}

	public void setP1(Point p1) {
		this.p1Center = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	private double getLength(Point p1Center, Point p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1Center.getX(), 2) + Math.pow(p2.getY() - p1Center.getY(), 2));
	}

	private boolean isCircle() {
		if (getLength(p1Center, p2) > 0) {
			return true;
		} else
			return false;
	}

	@Override
	double perimetr() {
		if (isCircle()) {
			return 2 * Math.PI * getLength(p1Center, p2);
		} else
			return 0;
	}

	@Override
	double area() {
		if (isCircle()) {
			return Math.PI * Math.pow(getLength(p1Center, p2), 2);
		} else
			return 0;
	}

	@Override
	public String toString() {
		if (isCircle()) {
			return "Circle [p1Center=" + p1Center + ", p2=" + p2 + "]";
		} else
			return "FAIL NOT A CIRCLE !!!";
	}

}
