package examples.shape.factories;

import examples.shape.products.Circle;
import examples.shape.products.Color;
import examples.shape.products.Rectangle;
import examples.shape.products.Shape;
import examples.shape.products.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
