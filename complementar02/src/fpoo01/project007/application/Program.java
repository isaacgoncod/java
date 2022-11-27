package fpoo01.project007.application;

import java.util.Scanner;

import fpoo01.project007.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double cotacao;
		double dinheiro;

		System.out.println("What is the dollar price?");
		cotacao = scan.nextDouble();

		System.out.println("How many dollars will be bought?");
		dinheiro = scan.nextDouble();

		System.out.println("Amount to be paid in reais = " + CurrencyConverter.calculate(cotacao, dinheiro));

		scan.close();

	}

}
