package exemplos.ex002.application;

import java.util.Scanner;

import exemplos.ex002.entities.Produto;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		double soma = 0.0;
		double media = 0.0;
		
		System.out.printf("Digite qual sera o tamanho do vetor: ");
		n = scan.nextInt();

		Produto[] vetor = new Produto[n];

		for (int i = 0; i < vetor.length; i++) {
			scan.nextLine();
			String nome = scan.nextLine();
			double preco = scan.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
			
			soma += vetor[i].getPreco();
		}
		
		media = soma / vetor.length;
		
		System.out.printf(String.format("Media: %.2f", media));
		
		scan.close();

	}

}
