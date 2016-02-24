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

	private double[] getLength(Point p1, Point p2, Point p3, Point p4) {
		double[] lengthArray = new double[4];
		lengthArray[0] = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
		lengthArray[1] = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2));
		lengthArray[2] = Math.sqrt(Math.pow(p4.getX() - p3.getX(), 2) + Math.pow(p4.getY() - p3.getY(), 2));
		lengthArray[3] = Math.sqrt(Math.pow(p1.getX() - p4.getX(), 2) + Math.pow(p1.getY() - p4.getY(), 2));
		return lengthArray;
	}

	private boolean isSquare() {
		double[] lengthArray = getLength(p1, p2, p3, p4);
		if (lengthArray[0] == lengthArray[1] && lengthArray[0] == lengthArray[2] && lengthArray[0] == lengthArray[3]
				&& lengthArray[0] == lengthArray[3]) {
			return true;
		} else
			return false;
	}

	@Override
	double perimetr() {
		if (isSquare()) {
			double[] lengthArray = getLength(p1, p2, p3, p4);
			return 4 * lengthArray[0];
		} else
			return 0;
	}

	@Override
	double area() {
		if (isSquare()) {
			double[] lengthArray = getLength(p1, p2, p3, p4);
			return Math.pow(lengthArray[0], 2);
		} else
			return 0;
	}

	@Override
	public String toString() {
		if (isSquare()) {
			double[] lengthArray = getLength(p1, p2, p3, p4);
			return "Square [" + p1 + ", " + p2 + ", " + p3 + ", " + p4 + "]" + " or Square [a=" + lengthArray[0] + "";
		} else
			return "FAIL NOT A SQUARE!!!";
	}

}
