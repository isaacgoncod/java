package aula01;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digíte dois números inteiros: ");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();

			System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + (numero1 + numero2));
		}
		System.out.println("Digíte");
	}

}