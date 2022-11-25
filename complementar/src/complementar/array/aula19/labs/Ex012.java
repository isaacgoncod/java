package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex012 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice:" + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
		}
		System.out.println("Soma : " + soma);
	}

}
