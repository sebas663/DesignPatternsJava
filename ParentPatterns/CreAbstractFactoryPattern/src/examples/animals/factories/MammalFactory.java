package examples.animals.factories;

import examples.animals.products.Animal;
import examples.animals.products.Cat;
import examples.animals.products.Dog;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
