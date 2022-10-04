package basico.aula17;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		int aux = 0, i, j;
		
		System.out.println("Digíte 5 números inteiros positivos:");
		
		try (Scanner scan = new Scanner(System.in)) {			
			for(i = 0; i < 5; i++) {
				do {
					num[i] = scan.nextInt();
				}while(i < 0);
			}
		}
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(num[i] < num[j]) {
					num[i] = aux;
					num[i]	= num[j];
					num[j] = aux;
				}
			}
			System.out.print(num[i]);
		}

	}

	
}
