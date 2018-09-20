package examples.ufo.products;

import examples.ufo.factories.ShipFactory;
import examples.ufo.factories.UFOShipFactory;

//ConcreteProduct extend AbstractProduct
public class UFOShip extends Ship {

    private ShipFactory shipFactory;

    public UFOShip(){
        setName("UFO Ship");
        this.shipFactory = new UFOShipFactory();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
