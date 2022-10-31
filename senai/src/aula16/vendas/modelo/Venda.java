package aula16.vendas.modelo;

public class Venda {

	private String produto;
	private int quantidade;
	private float preco; 
	public float subtotal() {

		return preco * quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		
		return String.format("%s \t\t%d\t\t%.2f\t%.2f\n", produto, quantidade, preco, subtotal());
	}
	
}












