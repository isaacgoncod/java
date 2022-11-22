package aula17.exercicios1.eleicao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int menuG;
	static int menuP;
	static int i = 0;
	static int contTotal = 0;
	static int contLula = 0;
	static int contBolsonaro = 0;
	static int contBrancoP = 0;
	static int contNuloP = 0;
	static int contHaddad = 0;
	static int contTarcisio = 0;
	static int contBrancoG = 0;
	static int contNuloG = 0;
	static double porcentLula = 0;
	static double porcentBolsonaro = 0;
	static double porcentTarcisio = 0;
	static double porcentHaddad = 0;
	static double porcentBrancoP = 0;
	static double porcentNuloP = 0;
	static double porcentBrancoG = 0;
	static double porcentNuloG = 0;
	static double porcentEleitoP = 0;
	static double porcentEleitoG = 0;
	static String eleitoP = null;
	static String eleitoG = null;

	static Scanner scan = new Scanner(System.in);

	public static void porcentVotos() {

		porcentLula = (contLula * 100 / contTotal);
		porcentBolsonaro = (contBolsonaro * 100 / contTotal);
		porcentBrancoP = (contBrancoP * 100 / contTotal);
		porcentNuloP = (contNuloP * 100 / contTotal);
		porcentTarcisio = (contTarcisio * 100 / contTotal);
		porcentHaddad = (contHaddad * 100 / contTotal);
		porcentBrancoG = (contBrancoG * 100 / contTotal);
		porcentNuloG = (contNuloG * 100 / contTotal);

		if (porcentLula > porcentBolsonaro || porcentTarcisio > porcentHaddad) {
			eleitoP = "LULA";
			porcentEleitoP = porcentLula;
			eleitoG = "TARCISIO GOMES DE FREITAS";
			porcentEleitoG = porcentTarcisio;

		}
		if(porcentLula < porcentBolsonaro || porcentTarcisio < porcentHaddad) {
			eleitoP = "BOLSONARO";
			porcentEleitoP = porcentBolsonaro;
			eleitoG = "FERNANDO HADDAD";
			porcentEleitoG = porcentBolsonaro;
			
		}
		else {
			eleitoP = "(CANDIDATO)";
			porcentEleitoP = 0;
			eleitoG = "(CANDIDATO)";
			porcentEleitoG = 0;

		}
	}

	public static void main(String[] args) {

		Eleicao votos = new Eleicao();

		while (menuG != 1) {
			System.out.println("Digite o numero do SEU candidato a GOVERNADOR:");
			votos.setNumeroG(scan.nextInt());

			System.out.println(votos.getGovernador());
			if (votos.getGovernador().equals("TARCISIO GOMES DE FREITAS")) {
				System.out.println("\tPRESIDENTE: JAIR MESSIAS BOLSONARO 22\n\n NUMERO: " + votos.getNumeroG());
			}
			if (votos.getGovernador().equals("FERNANDO HADDAD")) {
				System.out.println("\tPRESIDENTE: LUIZ INACIO LULA DA SILVA 13\n\n NUMERO: " + votos.getNumeroG());
			}
			if (votos.getGovernador().equals("GOVERNADOR : VOTO BRANCO")) {
				System.out.println("NUMERO: " + votos.getNumeroG());
			}
			if (votos.getGovernador().equals("GOVERNADOR : VOTO NULO")) {
				System.out.println("NUMERO: " + votos.getNumeroG());
			}

			System.out.println("CONFIRMAR?\n1-SIM\n0-NAO");
			menuG = scan.nextInt();

			if (menuG == 1)
				System.out.println("CONFIRMADO");
		}

		while (menuP != 1) {
			System.out.println("Digite o numero do SEU candidato a PRESIDENTE:");
			votos.setNumeroP(scan.nextInt());

			System.out.println(votos.getPresidente());
			System.out.println("\nNUMERO: " + votos.getNumeroP());

			System.out.println("CONFIRMAR?\n1-SIM\n0-NAO");
			menuP = scan.nextInt();

			if (menuG == 1)
				System.out.println("CONFIRMADO");
		}

		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("./src/aula17/exercicios1/eleicao/bd/eleicao.csv", true));
			bw.write(votos.toCSV());
			bw.close();

			System.out.println("FIM!");

			try (BufferedReader br = new BufferedReader(
					new FileReader("./src/aula17/exercicios1/eleicao/bd/eleicao.csv"))) {
				String linha = null;

				while ((linha = br.readLine()) != null) {
					String vetor[] = linha.split(";");

					if (i != 0) {

						if (vetor[0].equals("JAIR MESSIAS BOLSONARO")) {
							contBolsonaro++;
							
						}

						if (vetor[0].equals("TARCISIO GOMES DE FREITAS")) {
							contTarcisio++;
							
						}

						if (vetor[0].equals("LUIZ INACIO LULA DA SILVA")) {
							contLula++;
							
						}

						if (vetor[0].equals("FERNANDO HADDAD")) {
							contHaddad++;
							
						}

						if (vetor[0].equals("PRESIDENTE : VOTO BRANCO")) {
							contBrancoP++;
							
						}

						if (vetor[0].equals("GOVERNADOR : VOTO BRANCO")) {
							contBrancoG++;
							
						}

						if (vetor[0].equals("PRESIDENTE : VOTO NULO")) {
							contNuloP++;
							
						}

						if (vetor[0].equals("GOVERNADOR : VOTO NULO")) {
							contNuloG++;
							
						}

						contTotal++;
					}
					i++;
					linha = br.readLine();
				}
				porcentVotos();
				br.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Votos para o LULA: " + contLula + " = " + porcentLula + "%");
		System.out.println("Votos para o BOLSONARO: " + contBolsonaro + " = " + porcentBolsonaro + "%");
		System.out.println("Votos BRANCOS para PRESIDENTE: " + contBrancoP + " = " + porcentBrancoP + "%");
		System.out.println("Votos NULOS para PRESIDENTE: " + contNuloP + " = " + porcentNuloP + "%");
		System.out.println("Votos para o TARCISIO: " + contTarcisio + " = " + porcentTarcisio + "%");
		System.out.println("Votos para o HADDAD: " + contHaddad + " = " + porcentHaddad + "%");
		System.out.println("Votos BRANCOS para GOVERNADOR: " + contBrancoG + " = " + porcentBrancoG + "%");
		System.out.println("Votos NULOS para GOVERNADOR: " + contNuloG + " = " + porcentNuloG + "%");
		System.out.println("O candidato eleito a PRESIDÊNCIA " + eleitoP + " foi eleito em segundo turno com "
				+ porcentEleitoP + "% dos votos");
		System.out.println("O candidato eleito a GOVERNADOR " + eleitoG + " foi eleito em segundo turno com "
				+ porcentEleitoG + "% dos votos");
	}

}
