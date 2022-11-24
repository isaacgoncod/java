package complementar.array.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex004 {
	static DecimalFormat df = new DecimalFormat("###,###.###");

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			double[] vetorA = new double[5];
			double[] vetorB = new double[vetorA.length];
			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Digite o valor da posicao:" + (i+1));
				vetorA[i] = scan.nextInt();
				
				vetorB[i] = Math.sqrt(vetorA[i]);
				
			}
			
			System.out.println("Vetor A = ");
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();
			
	
			System.out.println("Vetor B = ");
			for(int i = 0; i < vetorB.length; i++) {
				System.out.println(df.format(vetorB[i]) + " ");
			}
			
			System.out.println();
		}
	}

}

