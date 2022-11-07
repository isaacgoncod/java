package objeto.aula036;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		String nome;
		
		Agenda agenda = new Agenda();
		
		System.out.println("Digite o nome da agenda: ");
		nome = scan.next();
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite as informações de contatos ", (i + 1));
			
			
		}
		
		

	}

}
