package examples.vendible.decorator;

import examples.vendible.component.Vendible;

public class Gasoil extends AutoDecorator {

	public Gasoil(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.getVendible().getDescripcion() + " + Gasoil";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return this.getVendible().getPrecio() + 2500;
	}

}
