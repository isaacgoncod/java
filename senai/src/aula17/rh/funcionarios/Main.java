package aula17.rh.funcionarios;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Funcionario> funcionarios = new ArrayList<>();

	static int menu = 0;
	static String opcoes[] = { "1. Casastrar", "2. Listar Todas", "3. Alterar Dados", "4. Excluir Registro",
			"5. Buscar por Nome", "6. Buscar por Matricula", "7. Buscar por Nacimento", "8. Terminar Programa" };

	public static void items(String[] items) {
		for (String i : items) {
			System.out.println(i);
		}
	}

	public static void cadastrar() throws ParseException {

		int qtd;

		System.out.println("Digite a quantidade de cadastros para o registro: ");
		qtd = scan.nextInt();

		System.out.println("Matricula\tNome\tdataNascimento");
		for (int i = 0; i < qtd; i++) {
			funcionarios.add(new Funcionario(scan.nextInt(), scan.next(), scan.next()));
		}
	}

	public static void listarTodas() {
		System.out.println("Indice\tMatricula\tNome\tdataNascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(i + "\t" + funcionarios.get(i));
		}
	}

	public static void alterar() throws ParseException {

		int indice;

		System.out.println("Digite o indice da vacina:");
		indice = scan.nextInt();

		System.out.println("Indice\tMatricula\tNome\tdataNascimento");
		System.out.println(indice + "\t" + funcionarios.get(indice));
		funcionarios.add(new Funcionario(scan.nextInt(), scan.next(), scan.next()));
		System.out.println("Registro Alterado");
	}

	public static void excluir() {

		int indice;

		System.out.println("Digite o indice do funcionario:");
		indice = scan.nextInt();

		funcionarios.remove(indice);
		System.out.println("Registro Excluido");
	}

	public static void buscarNome() {

		String nome;

		System.out.println("Digite o nome do funcionario: ");
		nome = scan.next();

		System.out.println("Indice\tMatricula\tNome\tdataNascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getNome().contains(nome)) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}
		}
	}

	public static void buscarMatricula() {

		int matricula;

		System.out.println("Digite o número da matricula do funcionario: ");
		matricula = scan.nextInt();

		System.out.println("Indice\tMatricula\tNome\tdataNascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}
		}
	}

	public static void buscarDataNascimento() {

		Calendar data = Calendar.getInstance();

		System.out.println("Digite a data de nascimento do funcionario: ");
		data = scan.nextInt();

		System.out.println("Indice\tMatricula\tNome\tdataNascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getNascimento().contains(data)) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}
		}
	}

	public static void main(String[] args) throws ParseException {

		while (menu != 8) {
			items(opcoes);
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				cadastrar();

				break;
			case 2:
				listarTodas();

				break;
			case 3:
				alterar();

				break;
			case 4:
				excluir();

				break;
			case 5:
				buscarNome();

				break;
			case 6:
				buscarMatricula();

				break;
			case 7:
				buscarDataNascimento();

				break;
			case 8:

				break;
			}

		}

	}

}
