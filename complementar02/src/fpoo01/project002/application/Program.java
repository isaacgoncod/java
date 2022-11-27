package fpoo01.project002.application;

import java.util.Locale;
import java.util.Scanner;

import fpoo01.project002.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Digite o nome, preco e a quantidade do produto: ");
		product.setName(scan.next());
		product.setPrice(scan.nextDouble());
;
		
		System.out.println(product.toString());
		System.out.println();

		System.out.println("Enter the number of products to be added in stock: ");
		product.addProducts(scan.nextInt());
		System.out.println(product.toString());
		System.out.println();

		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(scan.nextInt());
		System.out.println(product.toString());
		System.out.println();

		scan.close();

	}

}
