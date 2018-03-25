package examples.ufo.factories;

import examples.ufo.parts.ShipEngine;
import examples.ufo.parts.ShipWeapon;

//AbstractFactory
public abstract class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();

}
