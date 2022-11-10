package aula17.exercicios.irrf;

public class Imposto {
	
	private String nome;
	private double salario;
	
	public double irrf() {
		if (salario <= 1903.00) {
			return 0;
		}
		if (salario > 1903.00 && salario <= 2826.00) {
			return salario * 7.5 / 100;
		}
		if (salario > 2826.00 && salario <= 3751.00) {
			return salario * 15 / 100;
		}
		if (salario > 3751.00 && salario <= 4664.00) {
			return salario * 22.5 / 100;

		} else {
			return salario * 27.5 / 100;

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
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, irrf());
	}
	
	

}
