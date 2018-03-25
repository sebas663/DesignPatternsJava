package examples.vendible.decorator;

import examples.vendible.component.Vendible;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.getVendible().getDescripcion() + " + AireAcondicionado";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return this.getVendible().getPrecio() + 1500;
	}

}
