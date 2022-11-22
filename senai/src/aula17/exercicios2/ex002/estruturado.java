package aula17.exercicios2.ex002;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class estruturado {

	static BufferedReader br;

	public static void main(String[] args) {

		int contLinha = -1;
		int contColuna = 0;

		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/ex002/bd/dados2.csv"));
			String linha = br.readLine();

			while (linha != null) {
				String coluna[] = linha.split(",");
				System.out.println(coluna[0] + "\t" + coluna[1] + "\t" + coluna[2]);

				linha = br.readLine();
				contLinha++;
				contColuna = coluna.length;
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);

		}
		System.out.printf("\nO programa possui %d linhas", contLinha);
		System.out.printf("\nO programa possui %d Colunas", contColuna);

	}

}