package examples.animals.factories;

import examples.animals.products.Animal;
import examples.animals.products.Snake;
import examples.animals.products.Tyrannosaurus;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}

}
