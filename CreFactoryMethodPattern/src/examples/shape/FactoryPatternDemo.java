package examples.shape;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		showWithInterface();
		showWithAbstract();
	}

	private static void showWithInterface() {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		ShapeInterface shape1 = shapeFactory.getShapeInterface("CIRCLE");

		// call draw method of Circle
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		ShapeInterface shape2 = shapeFactory.getShapeInterface("RECTANGLE");

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		ShapeInterface shape3 = shapeFactory.getShapeInterface("SQUARE");

		// call draw method of circle
		shape3.draw();
	}

	private static void showWithAbstract() {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		ShapeAbstract shape1 = shapeFactory.getShapeAbstract("CIRCLE");

		// call draw method of Circle
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		ShapeAbstract shape2 = shapeFactory.getShapeAbstract("RECTANGLE");

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		ShapeAbstract shape3 = shapeFactory.getShapeAbstract("SQUARE");

		// call draw method of circle
		shape3.draw();
	}
}
