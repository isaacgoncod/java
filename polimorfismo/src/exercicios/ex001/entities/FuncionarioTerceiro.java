package exercicios.ex001.entities;

public final class FuncionarioTerceiro extends Funcionario {

	private Double valorAdicional;

	public FuncionarioTerceiro() {

	}

	public FuncionarioTerceiro(String nome, Integer hours, Double valorPorHora, Double valorAdicional) {
		super(nome, hours, valorPorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
}
