package example.vehicle.factory;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

import example.vehicle.intrinseco.ModeloBerlina;
import example.vehicle.intrinseco.ModeloDeportivo;
import example.vehicle.intrinseco.ModeloVehiculo;

public class VehiculoFactory {
	// El pool se encargar� de almacenar las instancias de los objetos
	// reutilizables
	private static Map<String, ModeloVehiculo> pool = new HashMap<String, ModeloVehiculo>();

	public static ModeloVehiculo GetCar(String marca, String modelo, String color) {
		ModeloVehiculo v = null;

		// Si el modelo ya ha sido creado anteriormente, se recupera del pool
		if (pool.containsKey(marca + " " + modelo + " " + color)) {
			v = pool.get(marca + " " + modelo + " " + color);
			System.out.println("\t* Recuperando del pool el vehiculo " + marca + " " + modelo + " " + color);
		}

		// En caso de que no exista, se instancia un nuevo objeto y se a�ade al
		// pool.
		// Las pr�ximas ocasiones en las que el objeto sea utilizado, se
		// devolver� una referencia
		// al objeto existente, evitando ocupar m�s memoria en crear una nueva
		// instancia
		else {
			// Dependiendo de alg�n par�metro (por ejemplo, si el modelo tiene
			// el sufijo 'sport'), se
			// instanciar� una clase u otra.
			if (modelo.endsWith("sport"))
				v = new ModeloDeportivo(marca, modelo, color);
			else
				v = new ModeloBerlina(marca, modelo, color);

			// Se a�ade el objeto al pool: las sucesivas llamadas usar�n este
			// objeto en lugar de
			// instanciar uno nuevo
			pool.put(marca + " " + modelo + " " + color, v);
			System.out.println("\t* Insertando en el pool el vehiculo " + marca + " " + modelo + " " + color);
		}

		return v;
	}

}
