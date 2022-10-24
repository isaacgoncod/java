package aula15.pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int qtd;
		int qtdCrianca = 0;
		int qtdJovem = 0;
		int qtdAdulto = 0;
		int qtdIdoso = 0;
		int somaCrianca = 0;
		int somaJovem = 0;
		int somaAdulto = 0;
		int somaIdoso = 0;
		double totalMedia = 0.0;

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de pessoas para o cadastramento : ");
			qtd = scan.nextInt();

			System.out.println("Digíte o nome, sobrenome e a quantidade(U) de pessoas para o cadastro: ");
			for (int i = 0; i < qtd; i++) {
				pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
			}
		}

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).faseDaVida().equals("Crianca")) {

				qtdCrianca++;
				somaCrianca += pessoas.get(i).idade;

			}
			if (pessoas.get(i).faseDaVida().equals("Jovem")) {

				qtdJovem++;
				somaJovem += pessoas.get(i).idade;
			}
			if (pessoas.get(i).faseDaVida().equals("Adulto")) {

				qtdAdulto++;
				somaAdulto += pessoas.get(i).idade;
			}
			if (pessoas.get(i).faseDaVida().equals("Idoso")) {

				qtdIdoso++;
				somaIdoso += pessoas.get(i).idade;
			}

			totalMedia += pessoas.get(i).idade;
		}

		System.out.println("Nome\t\tSobrenome\tIdade\t\tfaseDaVida()\n");
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf("%s     \t%s    \t%d\t\t%s\n", pessoas.get(i).nome, pessoas.get(i).sobrenome,
					pessoas.get(i).idade, pessoas.get(i).faseDaVida());
		}

		System.out.println();
		System.out.println("-------QUANTIDADE-------");
		System.out.printf("\nCrianca: %d\nJovem: %d\nAdulto: %d\nIdoso: %d\n\n", qtdCrianca, qtdJovem, qtdAdulto,
				qtdIdoso);
		System.out.println("-------MEDIA TOTAL DE IDADE-------");
		System.out.printf("\nMedia das pessoas cadastradas: %.2f\n", (totalMedia / pessoas.size()));
		System.out.println("-------MEDIA RELATIVA DE IDADE-------");
			System.out.printf("\nCrianca: %d\nJovem: %d\nAdulto: %d\nIdoso: %d\n\n", somaCrianca / qtdCrianca,
					somaJovem / qtdJovem, somaAdulto / qtdAdulto, somaIdoso / qtdIdoso);


	}

}
