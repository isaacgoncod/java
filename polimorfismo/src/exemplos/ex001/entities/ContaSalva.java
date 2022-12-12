package exemplos.ex001.entities;

//final diz que nao poderá ter mais nenhuma subclasse 
public final class ContaSalva extends Conta {

	private Double taxaJuro;

	public ContaSalva() {
		super();
	}

	public ContaSalva(Integer num, String titular, Double balanco, Double taxaJuro) {
		super(num, titular, balanco);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	public void attBalanco() {
		balanco += balanco * taxaJuro;
	}

	@Override
	public void saqueConta(double quantia) {
		balanco -= quantia;
	}

}
