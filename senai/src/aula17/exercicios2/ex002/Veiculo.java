package aula17.exercicios2.ex002;

public class Veiculo {

	private String modelo;
	private int ano;
	private double valor;

	public Veiculo() {
	}

	public Veiculo(String veiculo) {
		String[] colunas = veiculo.split(",");
		this.modelo = colunas[0];
		this.ano = Integer.parseInt(colunas[1]);
		this.valor = Double.parseDouble(colunas[2]);
	}

	public String rotulos() {
		return "Veículo\tAno\tValor";
	}

	@Override
	public String toString() {
		return String.format("%s\t%d\t%.2f", modelo, ano, valor);
	}

}