package example.vehicle;

import java.util.Date;

import example.vehicle.extrinseco.Vehiculo;

public class VehiculoDemo {

	public static void main(String[] args) {
		Date d = new Date();
		Vehiculo v1 = new Vehiculo("Seat", "Ibiza sport", "Amarillo", "1234-CCA", d, "71000011A");
		Vehiculo v2 = new Vehiculo("Seat", "Ibiza sport", "Rojo", "1235-CCA", d, "71000012A");
		Vehiculo v3 = new Vehiculo("Peugeot", "406", "Verde", "1236-CCA", d, "71000013A");
		Vehiculo v4 = new Vehiculo("Renault", "Clio sport", "Amarillo", "1237-CCA",d , "71000014A");
		Vehiculo v5 = new Vehiculo("Seat", "Ibiza sport", "Amarillo", "1238-CCA", d, "71000015A");

		v1.MostrarInformacionVehiculo();
		v2.MostrarInformacionVehiculo();
		v3.MostrarInformacionVehiculo();
		v4.MostrarInformacionVehiculo();
		v5.MostrarInformacionVehiculo();

	}

}
