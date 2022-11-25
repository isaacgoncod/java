package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex018 {

	static Scanner scan = new Scanner(System.in);
	static int[] idades = new int[10];
	static int menorIdade = 0;
	static int maiorIdade = 0;
	static int indexMaior = 0;
	static int indexMenor = 0;

	public static void main(String[] args) {

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade da pessoa:" + i);
			idades[i] = scan.nextInt();
		}
		menorIdade = idades[0];
		maiorIdade = idades[0];

		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			} else if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
			}
		}

		System.out.println("Vetor de idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] + " ");
		}
		System.out.println();

		System.out.println("Menor idade:" + menorIdade);
		System.out.println(" Indice menor idade:" + indexMenor);
		System.out.println("Maior idade:" + maiorIdade);
		System.out.println(" Indice maior idade:" + indexMaior);

	}
}