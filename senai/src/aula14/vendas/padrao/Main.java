package aula14.vendas.padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		float auxA;
		float auxB;
		String auxn;
		float subTotal[] = new float[3];
		float total = 0;

		Venda[] vendas = new Venda[3];

		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < vendas.length; i++) {
				System.out.println(
						"Digíte o nome, preco(R$) e a quantidade(U) do " + (i + 1) + "º produto respectivamente: ");
				vendas[i] = new Venda(scan.next(), scan.nextFloat(), scan.nextFloat());

			}
		}

		for (int i = 0; i < vendas.length; i++) {
			subTotal[i] = subTotal[i] + vendas[i].getSubtotal();
			total += subTotal[i];
		}

		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < (vendas.length - 1); j++) {
				if (vendas[i].preco < vendas[j].preco) {

					auxA = vendas[i].preco;
					vendas[i].preco = vendas[j].preco;
					vendas[j].preco = auxA;

					auxn = vendas[i].produto;
					vendas[i].produto = vendas[j].produto;
					vendas[j].produto = auxn;

				}
			}
		}

		System.out.println("Produto\t\tPreco\tQuantidade\tSubtotal");
		for (int i = 0; i < vendas.length; i++) {
			System.out.printf("%s\t\t%.2f\t%.2f\t%.2f\t\n", vendas[i].produto, vendas[i].preco, vendas[i].quantidade,
					subTotal[i]);
		}

		System.out.println("O produto mais barato é: " + vendas[0].produto);
		System.out.println("O produto mais caro é: " + vendas[(vendas.length - 1)].produto);

		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < (vendas.length - 1); j++) {
				if (vendas[i].quantidade < vendas[j].quantidade) {

					auxB = vendas[i].quantidade;
					vendas[i].quantidade = vendas[j].quantidade;
					vendas[j].quantidade = auxB;

					auxn = vendas[i].produto;
					vendas[i].produto = vendas[j].produto;
					vendas[j].produto = auxn;

				}
			}
		}

		System.out.println("O total dos preços dos produtos: " + total);
		System.out.println("A média dos precos: " + (total / vendas.length));
		System.out.println("O produto mais vendido é: " + vendas[(vendas.length - 1)].produto);

	}

}
