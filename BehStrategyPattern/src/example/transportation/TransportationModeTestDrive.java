package example.transportation;

public class TransportationModeTestDrive {

    public static void main(String[] args) {

        Traveler johnTraveler = new Traveler("John");
        Traveler lucyTraveler = new Traveler("Lucy");
        Traveler rickTraveler = new Traveler("Rick");

        johnTraveler.setTransportationMode(new CityBus());
        lucyTraveler.setTransportationMode(new PersonalCar());
        rickTraveler.setTransportationMode(new Taxi());

        johnTraveler.travelToAirport();
        lucyTraveler.travelToAirport();
        rickTraveler.travelToAirport();

    }

}
