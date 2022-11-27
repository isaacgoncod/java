package fpoo02.project009.application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite:");
		int n = scan.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = scan.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];

		}

		double media = soma / vect.length;

		System.out.println(" Media: " + media);

		scan.close();
	}
}
