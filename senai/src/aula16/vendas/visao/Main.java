package aula16.vendas.visao;

import java.util.ArrayList;
import java.util.Scanner;
import aula16.vendas.modelo.Venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Venda> vendas = new ArrayList<Venda>();

	static int menu = 0;

	public static void main(String[] args) {

		int qtd;

		while (menu != 5) {
			System.out.println("1. Cadastrar venda");
			System.out.println("2. Consultar vendas");
			System.out.println("3. Alterar venda");
			System.out.println("4. Excluir venda");
			System.out.println("5. Terminar programa");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digíte quantos cadastramentos deseja-se realizar:");
				qtd = scan.nextInt();

				System.out.println("Produto\tQuantidade\tPreco");

				for (int i = 0; i < qtd; i++) {
					create();
				}

				break;
			case 2:
				System.out.println("Produto\t\tQuantidade\tPreco\tsubtotal()");
				read();

				break;
			case 3:
				System.out.println("Digite qual item deseja alterar:");
				update(scan.nextInt());
				
				break;
			case 4:
				System.out.println("Digíte qual item quer excluir: ");
				delete(scan.nextInt());

				break;
			case 5:
				System.out.println("Obrigado por utilizar nosso sistema. Adeus!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			System.out.println("-------------------------------------------------------");
		}
	}

	public static void create() {
		Venda venda = new Venda();

		venda.setProduto(scan.next());
		venda.setQuantidade(scan.nextInt());
		venda.setPreco(scan.nextFloat());
		vendas.add(venda);
	}

	public static void read() {

		int i = 0;
		float total = 0f;

		for (Venda venda : vendas) {
			System.out.println(i + "-" + venda.toString());

			total += venda.subtotal();

			i++;
		}
		System.out.printf("Total = %.2f\n\n", total);
	}

	public static void delete(int indice) {
		if (indice >= 0 && indice <= vendas.size()) {
			vendas.remove((indice));
			System.out.println("Item excluido");

		} else {
			System.out.println("Item invalido.");
		}
	}

	public static void update(int indice) {
		if (indice >= 0 && indice <= vendas.size()) {
			System.out.println(vendas.get((indice)).toString());

			Venda venda = new Venda();

			venda.setProduto(scan.next());
			venda.setQuantidade(scan.nextInt());
			venda.setPreco(scan.nextFloat());
			vendas.set(indice, venda);
			
			System.out.println("Item alterado");

		} else {
			System.out.println("Item invalido.");
		}

	}

}