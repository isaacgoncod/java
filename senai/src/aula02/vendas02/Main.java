package aula02.vendas02;

public class Main {

	public static void main(String[] args) {
		
		Venda vendas[] =  new Venda[6];
		
		vendas[0] = new Venda();
		
		vendas[0].produto = "Camiseta";
		vendas[0].preco = 19.9f;
		vendas[0].quantidade = 5;
		
		vendas[1] = new Venda();
		
		vendas[1].produto = "Bermuda";
		vendas[1].preco = 39.9f;
		vendas[1].quantidade = 2;
		
		vendas[2] = new Venda();
		
		vendas[2].produto = "Calca";
		vendas[2].preco = 99.9f;
		vendas[2].quantidade = 8;
		
		vendas[3] = new Venda();
		
		vendas[3].produto = "Chapeu";
		vendas[3].preco = 49.9f;
		vendas[3].quantidade = 5;
		
		vendas[4] = new Venda();
		
		vendas[4].produto = "Terno";
		vendas[4].preco = 299.9f;
		vendas[4].quantidade = 2;
		
		vendas[5] = new Venda();
		
		vendas[5].produto = "Cinto";
		vendas[5].preco = 79.9f;
		vendas[5].quantidade = 8;
		
		
		float soma = 0.0f;
				
		for(int i = 0; i < 6; i++) {
			System.out.printf("%s\t\t%.2f\t%d\t%.2f\n", vendas[i].produto, vendas[i].preco, vendas[i].quantidade, vendas[i].getSubtotal());
			
			soma += vendas[i].getSubtotal();
		}
		
		System.out.println("O total é de: " + soma);
		
	}

}
