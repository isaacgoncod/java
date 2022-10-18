package aula14.nutricao.programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int qtd;
		float aux;
		String auxn;
		float somaImc = 0;
		float somaPeso = 0;
		float somaAlt = 0;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digíte quantos pacientes deseja cadastrar: ");
			qtd = scan.nextInt();

			Paciente[] pacientes = new Paciente[qtd];

			for (int i = 0; i < qtd; i++) {
				System.out.println("Digíte o nome, peso(Kg) e altura(M) da " + (i + 1) + "º pessoa respectivamente: ");
				pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());

			}
			for (int i = 0; i < qtd; i++) {
				somaImc = somaImc + pacientes[i].getImc();
				somaPeso = somaPeso + pacientes[i].peso;
				somaAlt = somaAlt + pacientes[i].altura;

			}

			float mediaImc = somaImc / qtd;
			float mediaPeso = somaPeso / qtd;
			float mediaAlt = somaAlt / qtd;

			for (int i = 0; i < qtd; i++) {
				for (int j = 0; j < (qtd - 1); j++) {
					if (pacientes[i].peso < pacientes[j].peso) {

						aux = pacientes[i].peso;
						pacientes[i].peso = pacientes[j].peso;
						pacientes[j].peso = aux;

						auxn = pacientes[i].nome;
						pacientes[i].nome = pacientes[j].nome;
						pacientes[j].nome = auxn;
					}
				}
			}

			// recomendado geralmente para fazer output
			for (Paciente paciente : pacientes) {
				System.out.println(paciente.toString());

			}

			System.out.println();
			System.out.println("Média IMC() dos pacientes: " + mediaImc);
			System.out.println("Média Peso() dos pacientes: " + mediaPeso);
			System.out.println("Média Altura() dos pacientes: " + mediaAlt);
			System.out.println("Quantidade de pacientes: " + pacientes.length);
			System.out.println("O Paciente mais magro é: " + pacientes[0].nome);
			System.out.println("O Paciente mais obeso é: " + pacientes[(qtd - 1)].nome);

			for (int i = 0; i < qtd; i++) {
				for (int j = 0; j < (qtd - 1); j++) {

					if (pacientes[i].altura < pacientes[j].altura) {

						aux = pacientes[i].altura;
						pacientes[i].altura = pacientes[j].altura;
						pacientes[j].altura = aux;

						auxn = pacientes[i].nome;
						pacientes[i].nome = pacientes[j].nome;
						pacientes[j].nome = auxn;

					}

				}

			}
			System.out.println("O Paciente mais baixo é: " + pacientes[0].nome);
			System.out.println("O Paciente mais alto é: " + pacientes[(qtd - 1)].nome);

		}
	}
}
