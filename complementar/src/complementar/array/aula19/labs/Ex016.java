package complementar.array.aula19.labs;

import java.util.Scanner;

public class Ex016 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int igual15 = 0;
		int qtdMaior15 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice:" + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros == 15: " + igual15);
		System.out.println("Soma de numeros < 15: " + somaMenor15);
		System.out.println("Media de numeros > 15: " + (somaMaior15/qtdMaior15));

	}

}
