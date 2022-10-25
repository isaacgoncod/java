package aula14.comercio.padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Operacao> opera = new ArrayList<Operacao>();

		int qtd;

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Digite quantos produtos deseja cadastrar : ");
			qtd = scan.nextInt();

			System.out.println(
					"Digíte o nome, quantidade comprada, quantidade vendida, preco da compra e o preco de venda dos produtos respectivamente: ");
			for (int i = 0; i < qtd; i++) {
				opera.add(
						new Operacao(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextFloat(), scan.nextFloat()));

			}
			System.out.println(
					"\nProduto\t\t\tqtdComprada\tqtdVendida\tprecoCompra\t\tprecoVenda\t\tinvestimento()\t\tfaturamento()\t\tlucro(R$)\t\tlucro(%)\t\trelacao");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			for (Operacao operacao : opera) {
				System.out.println(operacao.toString());
			}
			
//			for (int i = 0; i < opera.size(); i++) {
//				System.out.println(opera.get(i).toString());
//			}

		}
	}
}
