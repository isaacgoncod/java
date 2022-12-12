package exercicios.ex001.entities;

public class Juridico extends Pessoa {

	private Integer numFuncionario;

	public Juridico() {
		super();
	}

	public Juridico(String nome, Double rendaAnual, Integer numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public Integer getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	@Override
	public double imposto() {
		if (numFuncionario <= 10) {
			return getRendaAnual() * 0.16;
		} else {
			return getRendaAnual() * 0.14;
		}
	}

}
