package aula02.vendas02;

public class Venda {
	
	String produto;
	float preco;
	int quantidade;
	
	public float getSubtotal() {
		return preco * quantidade;
	}
}
