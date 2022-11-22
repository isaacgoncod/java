package aula17.exercicios2.ex001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static BufferedReader br;
	static int contLinhas = 0;
	static Pessoa p;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./src/aula17/exercicios2/ex001/bd/dados1.txt"));
			p = new Pessoa(br.readLine());
			
			while (p.getNome() != null) {
				System.out.println(p);
				contLinhas++;
				p = new Pessoa(br.readLine());
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		System.out.printf("O arquivo possui %d linhas", contLinhas);
	}

}