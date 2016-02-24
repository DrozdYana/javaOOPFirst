package com.github.shape;

public class Board {
	private double area;

	public Board(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void putShape(Shape[] shape) {
		double boardArea = this.getArea();
		for (Shape shapeIter : shape) {
			if (shapeIter.area() < boardArea) {
				System.out.println(shape + " was put on a board");
				boardArea -= shapeIter.area();
			} else
				System.out
						.println("There is no more space, please delete some shapes or stop. Space left " + boardArea);
		}
		this.setArea(boardArea);

	}

	public void delShape(Shape[] shape) {
		double boardArea = this.getArea();
		for (Shape shapeIter : shape) {
			boardArea += shapeIter.area();
		}
		this.setArea(boardArea);
	}
}
