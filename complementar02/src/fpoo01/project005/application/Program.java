package fpoo01.project005.application;

import java.util.Scanner;

import fpoo01.project005.entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Student student = new Student();
		
		System.out.println("Name :");
		student.name = scan.next();
		
		System.out.println("Notas: ");
		student.notaTrimestralA = scan.nextDouble();
		student.notaTrimestralB = scan.nextDouble();
		student.notaTrimestralC = scan.nextDouble();

		System.out.println(student.conceitoNota());

		scan.close();

	}

}
