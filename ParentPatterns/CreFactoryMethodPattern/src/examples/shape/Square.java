package examples.shape;

public class Square extends ShapeAbstract implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
