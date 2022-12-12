package exemplos.ex002.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exemplos.ex002.entities.enums.Color;
import exemplos.ex002.entities.Retangulo;
import exemplos.ex002.entities.Circulo;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Forma> list = new ArrayList<>();

		System.out.println("Digite a quantidade de formas: ");
		int qtd = scan.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Forma #" + i + " dados:");

			System.out.println("Retangulo ou Circulo (r/c)");
			char ch = scan.next().charAt(0);

			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Color cor = Color.valueOf(scan.next());

			if (ch == 'r') {
				System.out.println("Largura: ");
				double largura = scan.nextDouble();

				System.out.println("Altura: ");
				double altura = scan.nextDouble();

				list.add(new Retangulo(cor, largura, altura));
			} else {
				System.out.println("Raio: ");
				double raio = scan.nextDouble();

				list.add(new Circulo(cor, raio));
			}

		}
		System.out.println();
		System.out.println("AREA:");
		for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
		}

		scan.close();

	}

}
