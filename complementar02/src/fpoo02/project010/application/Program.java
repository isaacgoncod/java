package fpoo02.project010.application;

import java.util.Scanner;

import fpoo02.project010.entities.Product;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int n = scan.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();

			String name = scan.nextLine();
			double price = scan.nextDouble();

			vect[i] = new Product(name, price);

		}
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i]. getPrice();
		}
		double media = soma / vect.length;
		
		System.out.printf("AVERAGE PRICE =  %.2f", media);

		scan.close();
	}

}
