package fpoo02.project011.application;

import java.util.Scanner;

import fpoo02.project011.entities.Quarto;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int pedidos = scan.nextInt();

		Quarto[] quartos = new Quarto[10];
		for (int i = 0; i < pedidos; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.println("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.println("Email: ");
			String email = scan.nextLine();

			System.out.println("Room: ");
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
