package com.github.shape;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Board {
	private Shape[] shape = new Shape[4];

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
			if (this.shape[i] == null) {
				System.out.println("You've put on a board: " + shape[i]);
				this.shape[i] = shape[i];
			} else {
				System.out.println("There is no more space, please delete some shapes or stop.");

			}
		}

	}

	public void delShape(int position) {
		position --;
		
				if ((position>=0)&&(position<this.shape.length)) {
					this.shape[position] = null;
				} else {
					System.out.println("No such positionon the board! Please choose the other one");
				}
			

		
		System.out.println("Result after deletion: " + Arrays.toString(this.shape));
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
