package fpoo01.project003.application;

import java.util.Scanner;

import fpoo01.project003.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Enter rectangle width and heigth");
		rectangle.width = scan.nextDouble();
		rectangle.height= scan.nextDouble();
		
		System.out.println(rectangle.toString());
		
		scan.close();

	}

}
