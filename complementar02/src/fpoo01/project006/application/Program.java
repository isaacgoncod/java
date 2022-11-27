package fpoo01.project006.application;

import java.util.Scanner;

import fpoo01.project006.util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double radius;
		double c;
		double v;
		
		System.out.println("Enter radius: ");
		radius = scan.nextDouble();
		
		c = Calculator.circunferencia(radius);
		v = Calculator.volume(radius);
		
		System.out.printf(String.format("Circunferencia: %.2f\nVolume: %.2f\nPI value: %.2f\n", c, v, Calculator.PI));
		
		
		
		
		
		scan.close();

	}

}
