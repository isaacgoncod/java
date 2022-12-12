package exercicios.ex002.entities;

public class ProdutoImportado extends Produto {

	private Double customsFee;

	public ProdutoImportado(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPreco() + customsFee;
	}
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}