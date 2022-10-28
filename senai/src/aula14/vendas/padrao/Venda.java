package aula14.vendas.padrao;

public class Venda {

	String produto;
	float quantidade;
	float preco;

	public Venda(String produto, float quantidade, float preco) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public float getSubtotal() {

		return preco * quantidade;
	}
}
