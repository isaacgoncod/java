package fpoo01.project001.application;

import java.util.Locale;
import java.util.Scanner;

import fpoo01.project001.entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Triangle x= new Triangle();
		Triangle y = new Triangle();
		
		double areaX;
		double areaY;

		System.out.println("Enter the measure of triangle X:	");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c= scan.nextDouble();

		System.out.println("Enter the measure of triangle Y:	");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();

		areaX = x.area();
		areaY = y.area();


		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		scan.close();
	}
}
