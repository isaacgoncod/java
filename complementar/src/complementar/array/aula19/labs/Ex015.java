package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex015 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int contImpar = 0;
		int contPar = 0;
		double porcentPar = 0;
		double porcentImpar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice:" + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				contImpar++;
			}
		}
		contPar = vetorA.length - contImpar;
		
		porcentPar = (contPar * 100) / vetorA.length;
		porcentImpar = 100 - porcentPar;
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println("Porcentagem dos Pares: " + porcentPar);
		System.out.println("Porcentagem dos Impares: " + porcentImpar);
		
		

	}

}
