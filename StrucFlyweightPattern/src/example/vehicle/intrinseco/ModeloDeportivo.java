package example.vehicle.intrinseco;

public class ModeloDeportivo extends ModeloVehiculo {

	public ModeloDeportivo(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}
	public void MostrarCaracteristicas(String datosExtra) {
		super.MostrarCaracteristicas(datosExtra + " edicion Sport");
	}
}
