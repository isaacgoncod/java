package basico.aula13.exercicios;

import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		
		int num;
		
			try (Scanner scan = new Scanner(System.in)) {
				
				do {
					
					System.out.println("Digíte um número inteiro entre 0 e 100: ");
					num = scan.nextInt();
				
				}while(num < 0 || num > 100);
				
			}
			
			System.out.println("Metros: " + num + " m.");
			System.out.println("Centímetros: " + (num * 100) + " cm.");
	}
}
