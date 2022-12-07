package exemplos.ex001.application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		double soma = 0;
		double media = 0;
		
		System.out.printf("Digite qual sera o tamanho do vetor: ");
		n = scan.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextDouble();
			
			 soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.println("Media: " + media);

		scan.close();

	}

}
