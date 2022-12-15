package senai.aula19.gui.exercicio.ex001.model;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Paciente {

	// Atributos
	private String nome;
	private float peso;
	private float altura;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.0");

	// Método Construtor cheio com Strings
	public Paciente(String nome, String peso, String altura) {
		df.setCurrency(Currency.getInstance(BRASIL));

		this.nome = nome;
		try {
			this.peso = Float.parseFloat(df.parse(peso).toString());
			this.altura = Float.parseFloat(df.parse(altura).toString());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	// Método Construtor arquivo
	public Paciente(String linha) {
		df.setCurrency(Currency.getInstance(BRASIL));

		String colunas[] = linha.split(";");

		this.nome = colunas[0];
		try {
			this.peso = Float.parseFloat(df.parse(colunas[1]).toString());
			this.altura = Float.parseFloat(df.parse(colunas[2]).toString());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	// Métodos

	public float obterIMC() {
		return peso / (altura * altura);
	}

	public String obterDiagnostico() {
		if (obterIMC() < 18.5) {
			return "MAGREZA";
		} else if (obterIMC() < 24.9) {
			return "NORMAL";
		} else if (obterIMC() < 29.9) {
			return "SOBREPESO";
		} else if (obterIMC() < 39.9) {
			return "OBESIDADE";
		} else {
			return "OBESIDADE GRAVE";
		}
	}

	// Saida
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f\t%s", nome, peso, altura, obterDiagnostico());
	}

	public String[] toTable() {
		return new String[] { nome, String.format("%.2f", peso), String.format("%.2f", altura), obterDiagnostico() };
	}

	public String toCSV() {
		return String.format("%s;%.2f;%.2f;%s\r\n", nome, peso, altura, obterDiagnostico());
	}

}