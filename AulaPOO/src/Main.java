import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setNome("Bermuda");
		produto1.setId(1L);
		produto1.setValor(BigDecimal.valueOf(80));
		
		Produto produto2 = new Produto();
		produto2.setNome("Camisa");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(60));
		
		Produto produto3 = new Produto();
		produto3.setNome("Calça");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setNome("Chapéu");
		produto4.setId(4L);
		produto4.setValor(BigDecimal.valueOf(20));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Loja: ");
		venda.setEnderecoEntrega("Entrega por E-mail");
		venda.setId(10L);//long
		venda.setNomeCliente("Isaac Cordeiro Gonçalves");	
		//venda.setValoTotal(BigDecimal.valueOf(197.99));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);//Não consigo fazer validações
		venda.addProduto(produto3);//posso fazer validações antes de add na lista
		venda.getListaProdutos().add(produto4);
		System.out.println("Descrição da venda: " + venda.getDescricaoVenda() + " e o total : " + venda.getTotalVenda());
		
	}

}
