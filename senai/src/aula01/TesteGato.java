package aula01;

import java.util.Scanner;

public class TesteGato {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.peso[0] = 5;
		gato.raca[0] = "Persa";
		
		try (Scanner scan = new Scanner(System.in)) {
			for(int i = 0; i < gato.nome.length; i++) {
				System.out.printf("Digite o nome do " + (i + 1) + " gato: ");
				gato.nome[i] = scan.next();
			}
			for(int i = 0; i < gato.peso.length; i++) {
				System.out.printf("Digite o peso do " + (i + 1) + " gato: ");
				gato.peso[i] = scan.nextDouble();
			}
			for(int i = 0; i < gato.raca.length; i++) {
				System.out.printf("Digite a raça do " + (i + 1) + " gato: ");
				gato.raca[i] = scan.next();
			}
		}
		for(int i = 0; i < gato.nome.length; i++) {
			System.out.println("O gato " + gato.nome[i] + " tem o peso " + gato.peso[i] + "Kg e a raça " + gato.raca[i]);
		}

	}

}
