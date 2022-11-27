package fpoo01.project004.application;

import java.util.Scanner;

import fpoo01.project004.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = scan.next();
		
		System.out.println("GrossSalary: ");
		employee.grossSalary = scan.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = scan.nextDouble();
		
		System.out.println(String.format("Employee: %s, $ %.2f", employee.name, employee.netSalary()));
		
		System.out.println("Which percentage to increase salary: ");
		employee.increaseSalary(scan.nextDouble());
		
		System.out.println(String.format("Update data: %s, $ %.2f", employee.name, employee.netSalary()));
	
		scan.close();
	}

}
