package aula14.vendas.padrao;

public class Venda {
	
	String produto;
	float preco;
	float quantidade;
	
	
	public Venda(String produto, float preco, float quantidade) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public float getSubtotal() {
		
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
	

}
