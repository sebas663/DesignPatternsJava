package examples.shape;

public class Rectangle extends ShapeAbstract implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
