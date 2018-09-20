package examples.ufo.factories;

import examples.ufo.parts.ShipEngine;
import examples.ufo.parts.ShipWeapon;
import examples.ufo.parts.UFOBossEngine;
import examples.ufo.parts.UFOBossGun;

//ConcreteFactory extends AbstractFactory
public class UFOBossShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOBossGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOBossEngine();
    }
}
