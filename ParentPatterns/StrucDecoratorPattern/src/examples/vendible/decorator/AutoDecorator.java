package examples.vendible.decorator;

import examples.vendible.component.Vendible;

public abstract class AutoDecorator implements Vendible {
	private Vendible vendible;

	public AutoDecorator(Vendible vendible) {
		super();
		this.vendible = vendible;
	}

	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}
	
}
