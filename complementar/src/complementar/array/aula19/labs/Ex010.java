package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int[] vetorA = new int[10];
			int[] vetorB = new int[vetorA.length];
			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Digite o valor da posicao:" + (i+1));
				vetorA[i] = scan.nextInt();
				
				vetorB[i] = vetorA[i] % 2;
				
			}
			
			System.out.println("Vetor A = ");
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			
			System.out.println("Vetor B = ");
			for(int i = 0; i < vetorB.length; i++) {
				System.out.println(vetorB[i] + " ");
			}
		}
	}

}

