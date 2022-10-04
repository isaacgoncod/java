package basico.aula13.exercicios;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		
		int numero1, numero2;
		
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digíte dois números inteiros: ");
				 numero1 = scan.nextInt();
				 numero2 = scan.nextInt();
			}
			
			System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + (numero1 + numero2));
		
	}
}
