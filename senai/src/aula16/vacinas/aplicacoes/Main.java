package aula16.vacinas.aplicacoes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();

	static int menu = 0;
	static int qtd;
	static int anoAtual;
	static int mesAtual;
	static int diaAtual;

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		anoAtual = c.get(Calendar.YEAR);
		mesAtual = c.get(Calendar.MONTH);
		diaAtual = c.get(Calendar.DAY_OF_MONTH);

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

				System.out.println("Digite o nome do PET, VETERINARIO, VACINA e DATA respectivamente: ");

				for (int i = 0; i < qtd; i++) {
					create();
				}

				break;
			case 2:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina\tData");
				read();

				break;
			case 3:
				System.out.println("Digite qual dado deseja alterar:");
				update(scan.nextInt());

				break;
			case 4:
				System.out.println("Qual número de registro deseja-se excluir:");
				delete(scan.nextInt());

				break;
			case 5:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina\tData");
				System.out.println("consultar nome do PET:");
				consultaPet(scan.next());

				break;
			case 6:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina\tData");
				System.out.println("consultar nome do VETERINARIO:");
				consultaVeterinario(scan.next());

				break;
			case 7:
				System.out.println("NomePet\t\tVeterinario\tNomeVacina\tData");
				System.out.println("consultar nome da VACINA:");
				consultaVacina(scan.next());

				break;
			case 8:
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
		Vacina vacina = new Vacina();

		vacina.setNomePet(scan.next());
		vacina.setVeterinario(scan.next());
		vacina.setNomeVacina(scan.next());
		vacina.setDia(scan.nextInt());
		vacina.setMes(scan.nextInt());
		vacina.setAno(scan.nextInt());
		vacinas.add(vacina);
	}

	public static void read() {
		for (Vacina vacina : vacinas) {
			System.out.printf(vacina.toString());
			if (anoAtual > vacina.getAno()) {
				System.out.printf("Vacinado a " + (anoAtual - vacina.getAno()) + " anos\n\n");
			} else if (anoAtual == vacina.getAno()) {
				if (mesAtual > vacina.getMes()) {
					System.out.printf("Vacinado a " + (mesAtual - vacina.getMes() + 1) + " meses\n\n");
				} else if (mesAtual + 1 == vacina.getMes()) {
					if (diaAtual > vacina.getDia()) {
						System.out.printf("Vacinado a " + (diaAtual - vacina.getDia()) + " dias\n\n");
					} else if (diaAtual == vacina.getDia()) {
						System.out.printf("Vacinado hoje!\n\n");
					}
				}
			}
		}
	}

	public static void update(int indice) {
		if (indice >= 0 && indice <= vacinas.size()) {
			System.out.println(vacinas.get(indice).toString());

			Vacina vacina = new Vacina();

			vacina.setNomePet(scan.next());
			vacina.setVeterinario(scan.next());
			vacina.setNomeVacina(scan.next());
			vacina.setDia(scan.nextInt());
			vacina.setMes(scan.nextInt());
			vacina.setAno(scan.nextInt());
			vacinas.set(indice, vacina);

			System.out.println("Item alterado");

		} else {
			System.out.println("Item invalido.");
		}

	}

	public static void delete(int indice) {
		if (indice >= 0 && indice <= vacinas.size()) {
			vacinas.remove(indice);
			System.out.println("Item excluido");

		} else {
			System.out.println("Item invalido.");
		}
	}

	public static void consultaPet(String pet) {

		for (Vacina v : vacinas) {

			if (pet.equalsIgnoreCase(v.getNomePet())) {
				System.out.println(v.toString());
			}
		}

	}

	public static void consultaVeterinario(String veterinario) {

		for (Vacina v : vacinas) {
			if (veterinario.equalsIgnoreCase(v.getVeterinario())) {
				System.out.println(v.toString());
			}
		}

	}

	public static void consultaVacina(String vacina) {

		for (Vacina v : vacinas) {
			if (vacina.equalsIgnoreCase(v.getNomeVacina())) {
				System.out.println(v.toString());

			}
		}

	}
}
