package exercicios.ex001.entities;

public class Fisico extends Pessoa {

	private Double gastoSaude;

	public Fisico() {
		super();
	}

	public Fisico(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000.00) {
			return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
		} else {
			return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
		}
	}

}
