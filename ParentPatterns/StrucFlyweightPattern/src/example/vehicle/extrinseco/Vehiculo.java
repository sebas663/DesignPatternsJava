package example.vehicle.extrinseco;

import java.util.Date;

import example.vehicle.factory.VehiculoFactory;
import example.vehicle.intrinseco.ModeloVehiculo;
//extrinseco contiene los atributos que  cambian y ademas la interfaz con los intrinsecos.
public class Vehiculo {
	// Los datos implícitos estarán encapsulados dentro de la clase
	// ModeloVehiculo
	private ModeloVehiculo datosImplicitos;

	// Datos explícitos
	public String Matricula = "";
	public Date FechaMatriculacion = new Date();
	public String NifTitular = "";

	// Constructor del vehículo
	// Hace uso de la factoría para obtener (o generar, en caso de que no
	// exista) la parte implícita de
	// los datos del vehículo (marca, modelo y color)
	public Vehiculo(String marca, String modelo, String color, // Datos
																// implícitos
			String matricula, Date fechaMatriculacion, String nifTitular) // Datos
																			// explícitos
	{
		// Instanciamos o referenciamos los datos implícitos a través de la
		// factoría
		this.datosImplicitos = VehiculoFactory.GetCar(marca, modelo, color);

		// Asignamos los datos propios, exclusivos de este objeto
		this.Matricula = matricula;
		this.FechaMatriculacion = fechaMatriculacion;
		this.NifTitular = nifTitular;
	}

	// Método que accede tanto a datos implícitos como a datos explícitos
	public void MostrarInformacionVehiculo() {
		datosImplicitos.MostrarCaracteristicas(" con matricula " + Matricula + " (" + FechaMatriculacion.toString()
				+ ") registrado por " + NifTitular);
	}
}
