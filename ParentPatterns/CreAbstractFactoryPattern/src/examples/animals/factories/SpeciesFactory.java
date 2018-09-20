package examples.animals.factories;

import examples.animals.products.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);
}
