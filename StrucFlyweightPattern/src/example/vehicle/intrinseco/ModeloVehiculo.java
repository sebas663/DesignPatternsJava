package example.vehicle.intrinseco;
//intrinseco contiene los atributos que no cambian
public abstract class ModeloVehiculo {
	public String marca = "";
	public String modelo = "";
	public String color = "";

	public ModeloVehiculo(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public void MostrarCaracteristicas(String datosExtra) {
		System.out.println(marca + " " + modelo + " de color " + color + " " + "\n" + datosExtra + "\n");
	}

}
