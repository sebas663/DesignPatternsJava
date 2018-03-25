package examples.shape;

public class Circle extends ShapeAbstract implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}