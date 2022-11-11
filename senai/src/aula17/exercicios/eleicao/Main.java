package aula17.exercicios.eleicao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static int menuG = 0;
	static int menuP = 0;

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
			
			if(menuG == 1) System.out.println("CONFIRMADO");
		}

		while (menuP != 1) {
			System.out.println("Digite o numero do SEU candidato a PRESIDENTE:");
			votos.setNumeroP(scan.nextInt());

			System.out.println(votos.getPresidente());
			System.out.println("\nNUMERO: " + votos.getNumeroP());

			System.out.println("CONFIRMAR?\n1-SIM\n0-NAO");
			menuP = scan.nextInt();
			
			if(menuG == 1) System.out.println("CONFIRMADO");
		}

		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("./src/aula17/exercicios/eleicao/bancodados/eleicao.csv", true));
			bw.write(votos.toCSV());
			bw.close();

			System.out.println("FIM!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
