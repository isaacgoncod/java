package aula14.nutricao.programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int qtd;
		float somaImc = 0;
		float somaPeso = 0;
		float somaAlt = 0;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digíte quantos pacientes deseja cadastrar: ");
			qtd = scan.nextInt();

			Paciente[] pacientes = new Paciente[qtd];

			for (int i = 0; i < pacientes.length; i++) {
				System.out.println("Digíte o nome, peso(Kg) e altura(M) da " + (i + 1) + "º pessoa respectivamente: ");
				pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());

			}
			for (int i = 0; i < pacientes.length; i++) {
				somaImc = somaImc + pacientes[i].getImc();
				somaPeso = somaPeso + pacientes[i].getPeso();
				somaAlt = somaAlt + pacientes[i].getAltura();
				
			}

			float mediaImc = somaImc / qtd;
			float mediaPeso = somaPeso / qtd;
			float mediaAlt = somaAlt / qtd;

			// recomendado geralmente para fazer output
			for (Paciente paciente : pacientes) {
				System.out.println(paciente.toString());

			}
			
			System.out.println();
			System.out.println("Média IMC(): " + mediaImc);
			System.out.println("Média Peso(): " + mediaPeso);
			System.out.println("Média Alt(): " + mediaAlt);
			System.out.println("Quantidade de pacientes: " + pacientes.length);
			
			
			
		}

	}
}
