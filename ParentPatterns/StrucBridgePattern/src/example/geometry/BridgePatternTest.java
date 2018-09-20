package example.geometry;

import example.geometry.abstraction.Pentagon;
import example.geometry.abstraction.Shape;
import example.geometry.abstraction.Triangle;
import example.geometry.implementor.GreenColor;
import example.geometry.implementor.RedColor;

public class BridgePatternTest {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();

	}
}
