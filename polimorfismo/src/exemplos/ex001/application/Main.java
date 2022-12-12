package exemplos.ex001.application;

import exemplos.ex001.entities.Conta;
import exemplos.ex001.entities.ContaSalva;

public class Main {

	public static void main(String[] args) {
		
		Conta x = new Conta(1020, "Alex", 1000.0);
		Conta y = new ContaSalva(1023, "Isaac", 1000.0, 0.01);
		
		x.saqueConta(50.0);
		y.saqueConta(50.0);
		
		System.out.println(x.getBalanco());
		System.out.println(y.getBalanco());
		

	}

}
