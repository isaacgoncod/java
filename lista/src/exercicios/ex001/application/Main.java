package exercicios.ex001.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.ex001.entities.Funcionario;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("Quantos funcionarios serao registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(id, name, salario));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Digite o ID do funcionario que recebera a promocao: ");
		int id = sc.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Digite a porcentagem de aumento: ");
			double porcent = sc.nextDouble();
			emp.aumentoSalario(porcent);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("Lista de funcionarios:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}