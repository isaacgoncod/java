package aula16.vacinas.aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

import aula16.vendas.modelo.Venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();

	static int menu = 0;

	public static void main(String[] args) {

		int qtd;

		while (menu != 8) {
			System.out.println("1. Cadastrar vacina");
			System.out.println("2. Listar todas");
			System.out.println("3. Alterar dados");
			System.out.println("4. Excluir registro");
			System.out.println("5. Buscar por pet");
			System.out.println("6. Buscar por veterinario");
			System.out.println("7. Buscar por vacina");
			System.out.println("8. Terminar programa");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digíte quantos cadastramentos deseja-se realizar:");
				qtd = scan.nextInt();

				System.out.println("NomePet\tVeterinario\tNomeVacina");

				for (int i = 0; i < qtd; i++) {
					create();
				}

				break;
			case 2:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina");
				read();

				break;
			case 3:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina");
				read();

				break;
			case 4:
				System.out.println();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Obrigado por utilizar nosso sistema. Adeus!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public static void create() {
		Vacina vacina = new Vacina();

		vacina.setNomePet(scan.next());
		vacina.setVeterinario(scan.next());
		vacina.setNomeVacina(scan.next());
		vacinas.add(vacina);
	}

	public static void read() {
		for (Vacina vacina : vacinas) {
			System.out.println(vacina.toString());
		}
	}
	
	public static void delete(int indice) {
		if (indice >= 0 && indice <= vacinas.size()) {
			vacinas.remove((indice));
			System.out.println("Item excluido");

		} else {
			System.out.println("Item invalido.");
		}
	}

	public static void update(int indice) {
		if (indice >= 0 && indice <= vacinas.size()) {
			System.out.println(vacinas.get((indice)).toString());

			Vacina vacina = new Vacina();

			vacina.setNomePet(scan.next());
			vacina.setVeterinario(scan.next());
			vacina.setNomeVacina(scan.next());
			vacinas.set(indice, vacina);
			
			System.out.println("Item alterado");

		} else {
			System.out.println("Item invalido.");
		}

	}
}
