package complementar.array.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex008 {
	static DecimalFormat df = new DecimalFormat("###,###.###");

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			double[] vetorA = new double[5];
			double[] vetorB = new double[vetorA.length];
			double[] vetorC = new double[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Digite o valor da posicao:" + (i + 1));
				vetorA[i] = scan.nextDouble();

			}

			for (int i = 0; i < vetorB.length; i++) {
				System.out.println("Digite o valor da posicao:" + (i + 1));
				vetorB[i] = scan.nextDouble();

			}
			for (int i = 0; i < vetorC.length; i++) {
				vetorC[i] = vetorA[i] * vetorB[i];
			}

			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(df.format(vetorA[i]) + " ");
			}
			System.out.println();

			System.out.println("Vetor B = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println(df.format(vetorB[i]) + " ");
			}
			System.out.println();
			
			System.out.println("Vetor C = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println(df.format(vetorC[i]) + " ");
			}

			System.out.println();
		}
	}

}
