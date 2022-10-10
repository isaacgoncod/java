package aula12.vendas01;

//import javax.swing.JOptionPane;

public class Main {
	
	static Venda venda1, venda2, venda3, venda4;// instâncias da classe venda
	
	public static void main(String[] args) {
		
		/*Venda venda1 = new Venda();
		
		String produto1 = JOptionPane.showInputDialog("Qual o nome do produto ?");
		String preco1 = JOptionPane.showInputDialog("Qual o preco do produto ?");
		String quantidade1 = JOptionPane.showInputDialog("Qual a quantidade do produto ?");
		
		venda1.setProduto(produto1);
		venda1.setPreco(Double.valueOf(preco1));//casting
		venda1.setQuantidade(Integer.valueOf(quantidade1));//casting
		
		System.out.println(venda1.toString());
		
		System.out.println("O subtotal do item " + venda1.getProduto() + " é: " + venda1.getSubtotal());*/
		
		venda1 = new Venda();
		venda2 = new Venda();
		venda3 = new Venda();
		venda4 = new Venda();
		
		venda1.produto = "Camiseta";
		venda1.preco = 19.9f;
		venda1.quantidade = 5;
		
		venda2.produto = "Bermuda";
		venda2.preco = 39.9f;
		venda2.quantidade = 2;
		
		venda3.produto = "Calça";
		venda3.preco = 99.9f;
		venda3.quantidade = 1;
		
		venda4.produto = "Moletom";
		venda4.preco = 149.9f;
		venda4.quantidade = 3;
		
		System.out.println("Vendas");
		System.out.println("[Produto] [Preco] [QTD.] [Subtotal]");
		System.out.printf("[%s] [%.2f] [%d] %.2f\n", venda1.produto, venda1.preco, venda1.quantidade, venda1.getSubtotal());
		System.out.printf("[%s] [%.2f] [%d] %.2f\n", venda2.produto, venda2.preco, venda2.quantidade, venda2.getSubtotal());
		System.out.printf("[%s] [%.2f] [%d] %.2f\n", venda3.produto, venda3.preco, venda3.quantidade, venda3.getSubtotal());
		System.out.printf("[%s] [%.2f] [%d] %.2f\n", venda4.produto, venda4.preco, venda4.quantidade, venda4.getSubtotal());
		
		System.out.printf("Total [%.2f]", (venda1.getSubtotal() + venda2.getSubtotal() + venda3.getSubtotal() + venda4.getSubtotal()));
	}

}
