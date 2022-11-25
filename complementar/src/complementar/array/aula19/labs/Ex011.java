package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex011 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int qtdPares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice:" + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0)
				qtdPares++;

		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros pares: " + qtdPares);
	}

}
