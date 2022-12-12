package exemplos.ex001.application;

import exemplos.ex001.entities.Conta;
import exemplos.ex001.entities.ContaEmpresa;
import exemplos.ex001.entities.ContaSalva;

public class Main {

	public static void main(String[] args) {

//		Conta acc = new Conta(1001, "isaac", 0.0);

//		ContaEmpresa bacc = new ContaEmpresa(1002, "Melissa", 0.0, 500.0);

//		UPCASTING

//		Conta acc1 = bacc;
		Conta acc2 = new ContaEmpresa(1003, "Gustavo", 0.0, 200.0);
		Conta acc3 = new ContaSalva(1004, "Joao", 0.0, 100.0);

//		DOWNCASTING

		ContaEmpresa acc4 = (ContaEmpresa) acc2;
		acc4.emprestimo(100.0);

//		ContaEmpresa acc5 = (ContaEmpresa) acc3; n e possivel pois ambos são heranca da mesma classe

		if (acc3 instanceof ContaEmpresa) {
			ContaEmpresa acc5 = (ContaEmpresa) acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		if (acc3 instanceof ContaSalva) {
			ContaSalva acc5 = (ContaSalva) acc3;
			acc5.attBalanco();
			System.out.println("Atualização!");
		}
		
//		@Override -  implementação de um metodo de uma classe para outra
		Conta acc6 =  new Conta(1001, "Isaac", 1000.0);
		acc6.saqueConta(200.0);
		System.out.println(acc6.getBalanco());
		
		Conta acc7 = new ContaSalva(1002, "Melissa", 1000.0, 0.01);
		acc7.saqueConta(200.0);
		System.out.println(acc7.getBalanco());		
		
//		super() aproveita a logica da classe pai
		Conta acc8 = new ContaEmpresa(1003, "Gustavo", 1000.0, 500.0);
		acc8.saqueConta(200.0);
		System.out.println(acc8.getBalanco());
		

	}

}
