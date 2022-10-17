package objeto.aula05;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {

		int num;

		imprimirTela(MinhaCalculadora.getSomar(5, 2));
		imprimirTela(MinhaCalculadora.getSubtrair(5, 2));
		imprimirTela(MinhaCalculadora.getMultiplicar(5, 2));
		imprimirTela(MinhaCalculadora.getPotencia(5, 2));

		try (Scanner scan = new Scanner(System.in)) {
			do {
				System.out.println("Digíte um número positivo: ");
				num = scan.nextInt();

				if (num < 0) {
					System.out.println("Número inválido");
				}

			} while (num < 0);
			imprimirTela(MinhaCalculadora.getFatorialRecursivo(num));
		}
	
		

	}

	static void imprimirTela(double num) {
		System.out.println(num);
	}
}
