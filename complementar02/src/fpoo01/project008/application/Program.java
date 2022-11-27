package fpoo01.project008.application;

import java.util.Scanner;

import fpoo01.project008.entities.Account;

public class Program {
	public static void main(String[] args) {
	
	Scanner scan  = new Scanner (System.in);
	
	int number;
	String holder;
	char response;
	double initialDeposit;
	Account account;
	
	System.out.println("Enter account number: ");
	number = scan.nextInt();
	
	System.out.println("Enter account holder: ");
	//para colocar nome inteiro com espaço
	scan.nextLine();
	holder = scan.nextLine();
	
	System.out.println("Is there na initial deposit (y/n)?");
	//para ler somente uma letra
	response = scan.next().charAt(0);
	
	if(response ==  'y' || response == 'Y') {
		System.out.println("Enter initial deposit value: ");
		initialDeposit = scan.nextDouble();
		account = new Account(number, holder, initialDeposit);
		
	}else {
		account = new Account(number, holder);
	}
	System.out.println();

	System.out.println("Account data:");
	System.out.println(account.toString());
	System.out.println();
		
	System.out.println("Enter a deposit value: ");
	account.deposit(scan.nextDouble());
	
	System.out.println("Update account data: ");
	System.out.println(account.toString());
	System.out.println();
	
	System.out.println("Enter a withdraw value: ");
	account.withdraw(scan.nextDouble());
	
	System.out.println("Update account data: ");
	System.out.println(account.toString());
	System.out.println();

	scan.close();
	
	}

}
