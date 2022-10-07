package aula02.vendas01;

public class Venda {
	
	String produto;
	int quantidade;
	float preco;
	
/*	double preco;
	
	public double getSubtotal() {
		
		return preco * quantidade;
	}*/
	
	public float getSubtotal() {
		
		return preco * quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	/*public void setPreco(double preco) {
		this.preco = preco;
	}*/

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
}
