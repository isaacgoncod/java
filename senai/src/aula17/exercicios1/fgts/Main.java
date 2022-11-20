package aula17.exercicios1.fgts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		FundoGarantia fundos = new FundoGarantia();
		
		System.out.println("Digite o nome e o salario do funcionario: ");
		fundos.setNome(scan.next());
		fundos.setSalario(scan.nextFloat());
		
		System.out.println(fundos.toString());
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/aula17/exercicios/fgts/bancodados/fgts.csv", true));
			bw.write(fundos.toCSV());
			bw.close();
			System.out.println("Arquivo criado com sucesso.");

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		

	}

}
