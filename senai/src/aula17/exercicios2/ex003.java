package aula17.exercicios2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex003 {

	static BufferedReader br;
	static BufferedWriter bw;
	
	static int i = 0;
	static int ano = 0;
	static float total = 0f;
	static float media = 0f;
	static float preco = 0f;
	static float caro = 0f;
	static float barato = 1000000f;
	static float novo = 0f;
	static float velho = 10000000f;
	
	static String linhaCaro = null;
	static String linhaBarato = null;
	static String linhaVelho = null;
	static String linhaNovo = null;
	
	public static String toTXT() {
		return String.format("%.2f\t%s\t%s\t%s\t%s\r\n", media, linhaCaro, linhaBarato, linhaVelho, linhaNovo);
				
	}
	
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/bd/dados2.csv"));
			String linhaR = br.readLine();
			

			while (linhaR != null) {
				String vetor[] = linhaR.split(",");

				System.out.println(vetor[0] + "\t" + vetor[1] + "\t" + vetor[2]);

				if (i != 0) {
					preco = Float.parseFloat(vetor[2]);
					ano = Integer.parseInt(vetor[1]);

					if (caro < preco) {
						caro = preco;
						linhaCaro = linhaR;
					}
					if (barato > preco) {
						barato = preco;
						linhaBarato = linhaR;
					}
					if (velho > ano) {
						velho = ano;
						linhaVelho = linhaR;
					}
					if (novo < ano) {
						novo = ano;
						linhaNovo = linhaR;
					}
					total += preco;
				}
				i++;
				linhaR = br.readLine();
			}
			br.close();
			
			media = total / i;
			
			bw = new BufferedWriter(new FileWriter("./src/aula17/exercicios2/bd/relatorio.txt", true));
			bw.write(toTXT());
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);

		}
		System.out.printf("A média de preços = R$ %.2f\n", media);
		System.out.println("O veículo mais caro é: " + linhaCaro);
		System.out.println("O veículo mais barato é: " + linhaBarato);
		System.out.println("O veículo mais velho é : " + linhaVelho);
		System.out.println("O veículo mais novo é : " + linhaNovo);

	}

}