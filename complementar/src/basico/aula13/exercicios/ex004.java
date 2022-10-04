package basico.aula13.exercicios;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		
		int nota[] = new int[4] , i, soma = 0;
		
			try (Scanner scan = new Scanner(System.in)) {
				
				System.out.println("Digíte o 4 números inteiros: ");
				for(i = 0; i < 4; i++) {
					nota[i] = scan.nextInt();
					soma += nota[i];
				}
			}
			
			System.out.println("Média = " + soma / 4);
		
	}
}
