package examples.ufo.factories;

import examples.ufo.parts.ShipEngine;
import examples.ufo.parts.ShipWeapon;
import examples.ufo.parts.UFOEngine;
import examples.ufo.parts.UFOGun;

//ConcreteFactory extends AbstractFactory
public class UFOShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOEngine();
    }
}
