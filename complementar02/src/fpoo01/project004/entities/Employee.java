package fpoo01.project004.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double porcentage) {
		this.grossSalary += this.grossSalary * porcentage / 100;
	}

}
