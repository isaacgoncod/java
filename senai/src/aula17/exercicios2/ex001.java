package aula17.exercicios2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex001 {

	static BufferedReader br;

	public static void main(String[] args) {

		int contLinha = 0;

		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/bd/dados1.txt"));
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.printf(linha);
				String palavras[] = linha.split(" ");

				System.out.print("\tA linha possui " + linha.length() + " letras");
				System.out.println("\t" + palavras.length + " palavras");

				linha = br.readLine();
				contLinha++;
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
			
		}
		System.out.printf("\nO programa possui %d linhas", contLinha);

	}

}