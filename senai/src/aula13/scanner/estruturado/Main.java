package aula13.scanner.estruturado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		int idade;
		float peso;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();

			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();

			System.out.println("Digite seu peso: ");
			peso = scan.nextFloat();
		}
		System.out.printf("Nome: %s\nIdade: %d Anos\nPeso:%.1f Kg\n", nome, idade, peso);
	}

}
