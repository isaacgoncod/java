package aula17.exercicios1.inss;

public class Seguro {

	private String nome;
	private double salario;

	public double inss() {
		if (salario <= 1212.00) {
			return salario * 7.5 / 100;
		}
		if (salario > 1212.00 && salario <= 2427.00) {
			return salario * 9 / 100;
		}
		if (salario > 2427.00 && salario <= 3614.00) {
			return salario * 12 / 100;
		}
		if (salario > 3614.00 && salario <= 7087.00) {
			return salario * 14 / 100;

		} else {
			return 7087.22 * 14 / 100;

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
		return String.format("%s\t%.2f\t%.2f\r\n", nome, salario, inss());
	}
	public String toCSV() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, inss());
	}
	
	

}
