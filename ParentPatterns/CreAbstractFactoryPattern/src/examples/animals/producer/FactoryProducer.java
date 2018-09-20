package examples.animals.producer;

import examples.animals.factories.MammalFactory;
import examples.animals.factories.ReptileFactory;
import examples.animals.factories.SpeciesFactory;

public class FactoryProducer {

	public SpeciesFactory getSpeciesFactory(String type) {
		if ("mammal".equals(type)) {
			return new MammalFactory();
		} else {
			return new ReptileFactory();
		}
	}

}
