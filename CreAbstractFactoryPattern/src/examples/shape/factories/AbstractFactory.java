package examples.shape.factories;

import examples.shape.products.Color;
import examples.shape.products.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
