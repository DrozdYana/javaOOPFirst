package com.github.shape;

public class Board {
	private Shape[] shape;

	public Board() {
		super();

	}

	public Shape[] getShape() {
		return shape;
	}

	public void setShape(Shape[] shape) {
		this.shape = shape;
	}

	public void putShape(Shape[] shape) {
		for (int i = 0; i < shape.length; i++) {
			if (shape.length < 4) {
				System.out.println(shape[i] + " was put on a board");

			} else {
				System.out.println("There is no more space, please delete some shapes or stop.");

			}
		}
		this.setShape(shape);
	}

	public void delShape(Shape[] shape) {
		Shape[] shapeArray = this.getShape();
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < shapeArray.length; j++) {
				if (shape[i] == shapeArray[j]) {
					shapeArray[j] = null;
				} else {
					shapeArray[j] = shape[i];
				}
			}

		}
		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] != null) {
				shapeArray[i] = shapeArray[i];
			} else
				return;
		}
		this.setShape(shapeArray);
	}
}
