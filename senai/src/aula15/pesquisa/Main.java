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
		double totalMedia = 0.0;

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas para o cadastramento : ");
		qtd = scan.nextInt();

		System.out.println("Digíte o nome, sobrenome e a quantidade(U) de pessoas para o cadastro: ");
		for (int i = 0; i < qtd; i++) {
			pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
		}

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).faseDaVida().equals("Crianca")) {
				qtdCrianca++;

			}
			if (pessoas.get(i).faseDaVida().equals("Jovem")) {
				qtdJovem++;

			}
			if (pessoas.get(i).faseDaVida().equals("Adulto")) {
				qtdAdulto++;

			}
			if (pessoas.get(i).faseDaVida().equals("Idoso")) {
				qtdIdoso++;

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
		System.out.printf("\nCrianca: %d\nJovem: %d\nAdulto: %d\nIdoso: %d\n\n", qtdCrianca, qtdJovem, qtdAdulto, qtdIdoso);
		System.out.println("-------MEDIA DE IDADE-------");
		System.out.printf("\nMedia das pessoas cadastradas: %.2f",(totalMedia / pessoas.size()));
	}

}
