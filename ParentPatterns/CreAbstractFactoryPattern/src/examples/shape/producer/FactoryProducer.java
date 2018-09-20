package examples.shape.producer;

import examples.shape.factories.AbstractFactory;
import examples.shape.factories.ColorFactory;
import examples.shape.factories.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}
}
