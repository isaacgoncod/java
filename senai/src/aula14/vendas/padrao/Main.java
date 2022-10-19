package aula14.vendas.padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int quantos;
		float auxA;
		float auxB;
		String auxn;
		float total = 0;

		ArrayList<Venda> vendas = new ArrayList<Venda>();

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite quantos produtos deseja cadastrar : ");
			quantos = scan.nextInt();
			float subTotal[] = new float[quantos];

			for (int i = 0; i < quantos; i++) {
				System.out.println(
						"Digíte o nome, preco(R$) e a quantidade(U) do " + (i + 1) + "º produto respectivamente: ");
				vendas.add(new Venda(scan.next(), scan.nextFloat(), scan.nextFloat()));

			}

			for (int i = 0; i < quantos; i++) {
				subTotal[i] = (subTotal[i] + vendas.get(i).getSubtotal());
				total += subTotal[i];
			}

			for (int i = 0; i < quantos; i++) {
				for (int j = 0; j < (quantos - 1); j++) {
					if (vendas.get(i).preco < vendas.get(j).preco) {

						auxA = vendas.get(i).preco;
						vendas.get(i).preco = vendas.get(j).preco;
						vendas.get(j).preco = auxA;

						auxn = vendas.get(i).produto;
						vendas.get(i).produto = vendas.get(j).produto;
						vendas.get(j).produto = auxn;

					}
				}
			}

			System.out.println("Produto\t\tPreco\tQuantidade\tSubtotal");
			for (int i = 0; i < quantos; i++) {
				System.out.printf("%s\t\t%.2f\t%.2f\t\t%.2f\t\n", vendas.get(i).produto, vendas.get(i).preco,
						vendas.get(i).quantidade, subTotal[i]);
			}
		}

		System.out.println("O produto mais barato é: " + vendas.get(0).produto);
		System.out.println("O produto mais caro é: " + vendas.get(quantos - 1).produto);

		for (int i = 0; i < quantos; i++) {
			for (int j = 0; j < (quantos - 1); j++) {
				if (vendas.get(i).quantidade < vendas.get(j).quantidade) {

					auxB = vendas.get(i).quantidade;
					vendas.get(i).quantidade = vendas.get(j).quantidade;
					vendas.get(j).quantidade = auxB;

					auxn = vendas.get(i).produto;
					vendas.get(i).produto = vendas.get(j).produto;
					vendas.get(j).produto = auxn;

				}
			}
		}

		System.out.println("O total dos preços dos produtos: " + total);
		System.out.println("A média dos precos: " + (total / quantos));
		System.out.println("O produto mais vendido é: " + vendas.get(quantos - 1).produto);

	}

}
