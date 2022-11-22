package aula17.exercicios2.ex002;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static BufferedReader br;
	static int contLinha = 0;
	static int contColuna = 0;
	static Veiculo v;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/ex002/bd/dados2.csv"));
			String linha = br.readLine();
			
			System.out.println(new Veiculo().rotulos());
			linha = br.readLine();
			
			while (linha != null) {
				v = new Veiculo(linha);
				String coluna[] = linha.split(",");
	
				System.out.println(v);
				contLinha++;
				contColuna = coluna.length;
				linha = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		System.out.printf("O arquivo possui %d linhas e %d colunas\n", contLinha, contColuna);
	}

}