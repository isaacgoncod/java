package exemplos.ex001.entities;

public class ContaEmpresa extends Conta {

	private Double limiteEmprestimo;

	public ContaEmpresa() {
		super();

	}

	public ContaEmpresa(Integer num, String titular, Double balanco, Double limiteEmprestimo) {
		super(num, titular, balanco);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo) {
			balanco += quantia - 10.00;
		}
	}
	
	@Override
	public void saqueConta(double quantia) {
		super.saqueConta(quantia);
		balanco -= 2;
	}
}
