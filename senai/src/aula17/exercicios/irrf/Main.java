package aula17.exercicios.irrf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Imposto impostos = new Imposto();
		
		System.out.println("Digite o nome e o salario do funcionario: ");
		impostos.setNome(scan.next());
		impostos.setSalario(scan.nextDouble());
		
		System.out.println(impostos.toString());
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/aula17/exercicios/irrf/bancodados/irrf.csv", true));
			bw.write(impostos.toString());
			bw.close();
			
			System.out.println("Arquivo criado com sucesso.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
