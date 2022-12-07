package exercicios.ex001.application;

import java.util.Scanner;

import exercicios.ex001.entities.Quarto;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos quartos estao vagos para alugar?");
		int pedidos = scan.nextInt();

		Quarto[] quartos = new Quarto[10];
		for (int i = 0; i < pedidos; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.println("Nome: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.println("Email: ");
			String email = scan.nextLine();

			System.out.println("Quarto: ");
			int room = scan.nextInt();

			quartos[room] = new Quarto(name, email);
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());

			}
		}
		scan.close();
	}
}
