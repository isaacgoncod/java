package aula17.exercicios2.ex004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class estruturado {

	static BufferedReader br;
	static BufferedWriter bw;

	static int i = 0;
	static int contLula = 0;
	static int contBolsonaro = 0;
	static int contBranco = 0;
	static int contNulo = 0;
	static int contTotal = 0;
	static double porcentLula = 0;
	static double porcentBolsonaro = 0;
	static double porcentBranco = 0;
	static double porcentNulo = 0;
	static double porcentEleito = 0;
	static String eleito = null;

	public static void porcentVotos() {

		porcentLula = (contLula * 100 / contTotal);
		porcentBolsonaro = (contBolsonaro * 100 / contTotal);
		porcentBranco = (contBranco * 100 / contTotal);
		porcentNulo = (contNulo * 100 / contTotal);

		if (porcentLula > porcentBolsonaro) {
			eleito = "LULA";
			porcentEleito = porcentLula;

		} else {
			eleito = "BOLSONARO";
			porcentEleito = porcentBolsonaro;

		}
	}

	public static String toTXT() {
		return "Votos para o LULA: " + contLula + " = " + porcentLula + "%\r\nVotos para o BOLSONARO: " + contBolsonaro
				+ " = " + porcentBolsonaro + "%\r\nVotos BRANCOS: " + contBranco + " = " + porcentBranco
				+ "%\r\nVotos NULOS: " + contNulo + " = " + porcentNulo + "%\r\nO candidato " + eleito
				+ " foi eleito em segundo turno com " + porcentEleito + "% dos votos";
	}

	public static void main(String[] args) {

		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/ex004/bd/eleicao.csv"));
			String linha = br.readLine();

			while (linha != null) {
				String vetor[] = linha.split(";");

				if (i != 0) {
					if (vetor[1].equals("Lula")) {
						contLula++;
					}
					if (vetor[1].equals("Bolsonaro")) {
						contBolsonaro++;
					}
					if (vetor[1].equals("Branco")) {
						contBranco++;
					}
					if (vetor[1].equals("Nulo")) {
						contNulo++;
					}
					contTotal++;
				}
				i++;
				linha = br.readLine();

			}
			porcentVotos();
			br.close();

			bw = new BufferedWriter(new FileWriter("./src/aula17/exercicios2/ex004/bd/apuracao.txt"));
			bw.write(toTXT());
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);

		}

		System.out.println("Votos para o LULA: " + contLula + " = " + porcentLula + "%");
		System.out.println("Votos para o BOLSONARO: " + contBolsonaro + " = " + porcentBolsonaro + "%");
		System.out.println("Votos BRANCOS: " + contBranco + " = " + porcentBranco + "%");
		System.out.println("Votos NULOS: " + contNulo + " = " + porcentNulo + "%");
		System.out
				.println("O candidato " + eleito + " foi eleito em segundo turno com " + porcentEleito + "% dos votos");

	}
}
