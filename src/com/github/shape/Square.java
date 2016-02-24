package com.github.shape;

public class Square extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;

	public Square(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
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

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}

	private boolean isSquare() {
		if (p1.getLength(p1, p2) == p1.getLength(p2, p3) && p1.getLength(p1, p2) == p1.getLength(p3, p4)
				&& p1.getLength(p1, p2) == p1.getLength(p1, p4)) {
			return true;
		} else
			return false;
	}

	@Override
	double perimetr() {
		if (isSquare()) {
			return 4 * p1.getLength(p1, p2);
		} else
			return 0;
	}

	@Override
	double area() {
		if (isSquare()) {
			return Math.pow(p1.getLength(p1, p2), 2);
		} else
			return 0;
	}

	@Override
	public String toString() {
		if (isSquare()) {
			return "Square [" + p1 + ", " + p2 + ", " + p3 + ", " + p4 + "]" + " with length [a=" + p1.formatDouble(p1.getLength(p1, p2))
					+ "]";
		} else
			return "FAIL NOT A SQUARE!!!";
	}

}
