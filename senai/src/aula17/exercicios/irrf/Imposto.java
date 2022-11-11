package aula17.exercicios.irrf;

public class Imposto {
	
	private String nome;
	private double salario;
	
	public double irrf() {
		if (salario <= 1903.00) {
			return 0;
		}
		if (salario > 1903.00 && salario <= 2826.00) {
			return salario * 7.5 / 100 - 142.80;
		}
		if (salario > 2826.00 && salario <= 3751.00) {
			return salario * 15 / 100 - 354.80;
		}
		if (salario > 3751.00 && salario <= 4664.00) {
			return salario * 22.5 / 100 - 363.13;

		} else {
			return salario * 27.5 / 100 - 689.36;

		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f\r\n", nome, salario, irrf());
	}
	public String toCSV() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, irrf());
	}
	
	

}
