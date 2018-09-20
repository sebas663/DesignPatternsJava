package examples.vendible;

import examples.vendible.component.Audi;
import examples.vendible.component.GolTrend;
import examples.vendible.component.Vendible;
import examples.vendible.decorator.AireAcondicionado;
import examples.vendible.decorator.Gasoil;
import examples.vendible.decorator.MP3Player;

public class DecoratorDemo {

	public static void main(String[] args) {
		Vendible gol = new GolTrend();
		gol = new Gasoil(gol);
		gol = new MP3Player(gol);
		System.out.println(gol.getDescripcion());
		System.out.println("Su precio es : " + gol.getPrecio());

		Vendible audi = new Audi();
		audi = new AireAcondicionado(audi);
		audi = new MP3Player(audi);
		System.out.println(audi.getDescripcion());
		System.out.println("Su precio es : " + audi.getPrecio());

	}

}
