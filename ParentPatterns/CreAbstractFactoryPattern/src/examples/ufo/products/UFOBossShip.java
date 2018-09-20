package examples.ufo.products;

import examples.ufo.factories.ShipFactory;
import examples.ufo.factories.UFOBossShipFactory;

//ConcreteProduct extend AbstractProduct
public class UFOBossShip extends Ship {

    private ShipFactory shipFactory;

    public UFOBossShip(){
        setName("UFO Boss Ship");
        this.shipFactory = new UFOBossShipFactory();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
