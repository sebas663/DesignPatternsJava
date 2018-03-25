package examples.ufo;

import examples.ufo.products.Ship;
import examples.ufo.products.UFOBossShip;
import examples.ufo.products.UFOShip;


public class PatternDemo {

    public static void main(String[] args) {

        Ship ship;
        String typeShip;

        typeShip = "ufo";
        if(typeShip.equalsIgnoreCase("ufo")){
            ship = new UFOShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if(typeShip.equalsIgnoreCase("boss")){
            ship = new UFOBossShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

    }

}
