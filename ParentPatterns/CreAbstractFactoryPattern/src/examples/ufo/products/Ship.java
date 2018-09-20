package examples.ufo.products;

import examples.ufo.parts.ShipEngine;
import examples.ufo.parts.ShipWeapon;

//Our AbstractProduct
public abstract class Ship {

    private String name;
    private ShipWeapon shipWeapon;
    private ShipEngine shipEngine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipEngine getShipEngine() {
        return shipEngine;
    }

    public void setShipEngine(ShipEngine shipEngine) {
        this.shipEngine = shipEngine;
    }

    public ShipWeapon getShipWeapon() {
        return shipWeapon;
    }

    public void setShipWeapon(ShipWeapon shipWeapon) {
        this.shipWeapon = shipWeapon;
    }

    @Override
    public String toString() {
        return "NAME: " + getName() +
                " | ENGINE: "+ shipEngine.getShipEngineInformation() +
                " | WEAPON: " + shipWeapon.getShipWeaponInformation();
    }

    public abstract void makeShip();
}
