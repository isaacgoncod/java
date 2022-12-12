package exemplos.ex002.application;

import exemplos.ex002.entities.enums.Color;

public abstract class Forma {

	private Color cor;

	public Forma() {

	}

	public Forma(Color cor) {
		super();
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();

}
