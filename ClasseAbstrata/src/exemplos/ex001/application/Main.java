package exemplos.ex001.application;

import java.util.ArrayList;
import java.util.List;

import exemplos.ex001.entities.Conta;
import exemplos.ex001.entities.ContaEmpresa;
import exemplos.ex001.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		List<Conta> list = new ArrayList<>();

		list.add(new ContaPoupanca(1001, "Isaac", 500.0, 0.01));
		list.add(new ContaEmpresa(1002, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1003, "Melissa", 300.0, 0.01));
		list.add(new ContaEmpresa(1002, "Gustavo", 500.0, 500.0));

		double soma = 0.0;

		for (Conta acc : list) {
			soma += acc.getBalanco();
		}

		System.out.printf("Balanco Total: %.2f\n", soma);

		for (Conta acc : list) {
			acc.depositoConta(10.0);
		}

		for (Conta acc : list) {
			System.out.printf("Atualização de balanco da conta %d: %.2f\n ", acc.getNum(), acc.getBalanco());
		}

	}

}
