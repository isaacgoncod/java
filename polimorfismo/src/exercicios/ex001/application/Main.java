package exercicios.ex001.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.ex001.entities.Funcionario;
import exercicios.ex001.entities.FuncionarioTerceiro;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Digite a quantidade de funcionarios: ");
		int qtd = scan.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Funcionario #" + i + " data:");
			System.out.println("Terceirizado (s/n)?");
			char ch = scan.next().charAt(0);

			System.out.println("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();

			System.out.println("Horas: ");
			int horas = scan.nextInt();

			System.out.println("Valor por hora: ");
			double valorPorHora = scan.nextDouble();

			if (ch == 's') {
				System.out.println("Valor adicional: ");
				double valorAdicional = scan.nextDouble();
				list.add(new FuncionarioTerceiro(nome, horas, valorPorHora, valorAdicional));
			} else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario emp : list) {
			System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
		}

		scan.close();
	}

}
