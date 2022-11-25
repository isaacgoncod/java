package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex017 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int qtd = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite a idade da pessoa:" + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > 35) {
				qtd++;
			}
		}

		System.out.println("Vetor de idades = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas com mais de 35 anos: " + qtd);
		
}
}