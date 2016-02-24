package com.github.shape;

public class Runner {

	public static void main(String[] args) {
		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(4.0, 4.0);
		Point p3 = new Point(3.0, 1.0);
		Triangle triangle = new Triangle(p1, p2, p3);
		/** create Triangle */
		Shape shapeTriangle = triangle;
		double perimeter = shapeTriangle.perimetr();
		double square = shapeTriangle.area();
		System.out.println("1) " + shapeTriangle+ " -> perimeter=" + p1.formatDouble(perimeter) + "; square=" + p1.formatDouble(square));
		/** create Square */
		Point p4 = new Point(4.0, -1.0);
		Point p5 = new Point(4.0, -2.5);
		
		Point p6 = new Point(5.5, -2.5);
		Point p7 = new Point(5.5, -1.0);
		Shape shapeSquare = new Square(p4, p5, p6, p7);
		double perimeterSquare = shapeSquare.perimetr();
		double areaSquare = shapeSquare.area();
		System.out.println("2) " + shapeSquare + " -> perimeter=" + p1.formatDouble(perimeterSquare) + "; area=" + p1.formatDouble(areaSquare));
		/** create Circle */
		p1.setX(-2);
		p1.setY(-1);
		p2.setX(-1);
		p2.setY(1);
		Shape shapeCircle = new Circle(p1, p2);
		double perimeterCircle = shapeCircle.perimetr();
		double squareCircle = shapeCircle.area();
		System.out.println("3) " + shapeCircle + " -> perimeter=" + p1.formatDouble(perimeterCircle) + "; area=" + p1.formatDouble(squareCircle));

		Shape[] shapeArray={shapeTriangle,shapeSquare,shapeCircle,shapeCircle};
		Board board=new Board();
		System.out.println("4)");
		board.putShape(shapeArray);
		Shape[] shapeArrayDel={shapeTriangle};
		System.out.println("5)");
		board.delShape(shapeArrayDel);
		System.out.println("6)");
		System.out.println(board);
		Shape[] shapeArrayNew={shapeTriangle};
		board.putShape(shapeArrayNew);
		System.out.println(board);
	}

}
