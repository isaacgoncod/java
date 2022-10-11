package nutricao.programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Paciente[] pacientes = new Paciente[2];

		try (Scanner scan = new Scanner(System.in)) {

			for (int i = 0; i < pacientes.length; i++) {
				System.out.println("Digíte o nome, peso(Kg) e altura(M) da " + (i + 1) + "º pessoa respectivamente: ");
				pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
				
			}
		}
		for (int i = 0; i < pacientes.length; i++) {
			System.out.println(pacientes[i].toString());
		}
		
		//recomendado geralmente para fazer output
		for(Paciente paciente : pacientes) {
			System.out.println(paciente);
		}
	}

}
