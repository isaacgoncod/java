package aula19.gui.exercicios.ex002.models;

import javax.swing.JOptionPane;

public class Doador {

	// Atributos
	private String nome;
	private int idade;
	private char sexo;
	private float peso;

	// Método Construtor cheio
	public Doador(String nome, String idade, String sexo, String peso) {
		this.nome = nome;
		this.sexo = sexo.charAt(0);
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(peso);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	// Métodos
	public String obterDiagnostico() {
		if (this.idade >= 18 && this.idade <= 69 && this.peso >= 50)
			return "Apto";
		else
			return "Inapto";
	}

	// Saida
	public String[] toTable() {
		return new String[] { nome, String.format("%d", idade), String.format("%c", sexo), String.format("%.1f", peso),
				String.format("%s", obterDiagnostico()) };

	}

	public String toCSV() {
		return String.format("%s;%d;%s;%.1f;%s\r\n", nome, idade, sexo, peso, obterDiagnostico());
	}

}