package examples.vendible.decorator;

import examples.vendible.component.Vendible;

public class MP3Player extends AutoDecorator {

	public MP3Player(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.getVendible().getDescripcion() + " + MP3Player";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return this.getVendible().getPrecio() + 1000;
	}

}
