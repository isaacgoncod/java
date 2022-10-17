package aula14.nutricao.programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digíte quantos pacientes deseja cadastrar: ");
			int qtd = scan.nextInt();

			Paciente[] pacientes = new Paciente[qtd];

			for (int i = 0; i < pacientes.length; i++) {
				System.out.println("Digíte o nome, peso(Kg) e altura(M) da " + (i + 1) + "º pessoa respectivamente: ");
				pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());

			}
			for (int i = 0; i < pacientes.length; i++) {
				System.out.println(pacientes[i].toString());

			}

			// recomendado geralmente para fazer output
			for (Paciente paciente : pacientes) {
				System.out.println(paciente.toString());

			}
		}
	}

}
