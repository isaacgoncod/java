package aula17.rh.funcionarios;

import java.text.ParseException;
import java.util.ArrayList;
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
		
		int qtd ;
		
		System.out.println("Digite a quantidade de cadastros para o registro: ");
		qtd = scan.nextInt();
		
		System.out.println("Matricula\tNome\tData");
		for(int i = 0; i < qtd; i++	) {
			funcionarios.add(new Funcionario(scan.nextInt(), scan.next(), scan.next() ))
		}
	}

	public static void main(String[] args) {

		while (menu != 8) {
			items(opcoes);
			menu = scan.nextInt();

			switch (menu) {

			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			}

		}

	}

}
