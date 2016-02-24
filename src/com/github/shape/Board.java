package com.github.shape;

import java.text.DecimalFormat;
import java.util.Arrays;

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
			if ((shape.length < 5) && (this.getShape()==null)) {
				System.out.println("You've put on a board: " + shape[i]);
				

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
				if (shapeArray[j] == shape[i]) {
					shapeArray[j] = null;
				} else {
					shapeArray[j] = shapeArray[j];
				}
			}

		}

		this.setShape(shapeArray);
		System.out.println("Result after deletion: " + Arrays.toString(shapeArray));
	}

	@Override
	public String toString() {
		double squareFinal = 0.0;
		for (Shape shapeIter : shape) {
			if (shapeIter != null) {
				squareFinal += shapeIter.area();
			}
		}

		return "Board contains: " + Arrays.toString(shape) + "\nAll square of figures="
				+ new DecimalFormat("#0.00").format(squareFinal);
	}

}
