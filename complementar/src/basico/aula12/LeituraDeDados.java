package basico.aula12;

import java.net.Socket;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digíte seu nome completo");
		
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digíte seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: "+ primeiroNome);
		
		System.out.println("Digíte sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
	}

}
