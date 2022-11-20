package aula17.exercicios1.inss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Seguro seguros = new Seguro();
		
		System.out.println("Digite o nome e o salario do funcionario: ");
		seguros.setNome(scan.next());
		seguros.setSalario(scan.nextDouble());
		
		System.out.println(seguros.toString());
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/aula17/exercicios/inss/bancodados/inss.csv", true));
			bw.write(seguros.toCSV());
			bw.close();
			
			System.out.println("Arquivo criado com sucesso.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
