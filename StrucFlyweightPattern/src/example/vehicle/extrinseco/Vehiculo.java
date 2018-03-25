package example.vehicle.extrinseco;

import java.util.Date;

import example.vehicle.factory.VehiculoFactory;
import example.vehicle.intrinseco.ModeloVehiculo;
//extrinseco contiene los atributos que  cambian y ademas la interfaz con los intrinsecos.
public class Vehiculo {
	// Los datos impl�citos estar�n encapsulados dentro de la clase
	// ModeloVehiculo
	private ModeloVehiculo datosImplicitos;

	// Datos expl�citos
	public String Matricula = "";
	public Date FechaMatriculacion = new Date();
	public String NifTitular = "";

	// Constructor del veh�culo
	// Hace uso de la factor�a para obtener (o generar, en caso de que no
	// exista) la parte impl�cita de
	// los datos del veh�culo (marca, modelo y color)
	public Vehiculo(String marca, String modelo, String color, // Datos
																// impl�citos
			String matricula, Date fechaMatriculacion, String nifTitular) // Datos
																			// expl�citos
	{
		// Instanciamos o referenciamos los datos impl�citos a trav�s de la
		// factor�a
		this.datosImplicitos = VehiculoFactory.GetCar(marca, modelo, color);

		// Asignamos los datos propios, exclusivos de este objeto
		this.Matricula = matricula;
		this.FechaMatriculacion = fechaMatriculacion;
		this.NifTitular = nifTitular;
	}

	// M�todo que accede tanto a datos impl�citos como a datos expl�citos
	public void MostrarInformacionVehiculo() {
		datosImplicitos.MostrarCaracteristicas(" con matricula " + Matricula + " (" + FechaMatriculacion.toString()
				+ ") registrado por " + NifTitular);
	}
}
