package senai.aula19.gui.exercicio.ex002.model;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Doador {

	// Atributos
	private String cpf;
	private String nome;
	private int idade;
	private char sexo;
	private float peso;
	
	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.0");
	
	// Método Construtor cheio com Strings
	public Doador(String cpf, String nome, String idade, String sexo, String peso) {
		df.setCurrency(Currency.getInstance(BRASIL));
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo.charAt(0);
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(df.parse(peso).toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	// Método Construtor arquivo
	public Doador(String linha) {
		df.setCurrency(Currency.getInstance(BRASIL));
		String colunas[] = linha.split(";");
		this.cpf = colunas[0];
		this.nome = colunas[1];
		this.sexo = colunas[3].charAt(0);
		try {
			this.idade = Integer.parseInt(colunas[2]);
			this.peso = Float.parseFloat(df.parse(colunas[4]).toString());
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
	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\t%s\t%.1f\t%s",cpf, nome, idade, sexo, peso, obterDiagnostico());
	}

	public String[] toTable() {
		return new String[] { cpf, nome, String.format("%d", idade), String.format("%c", sexo), String.format("%.1f", peso),
				obterDiagnostico() };
	}

	public String toCSV() {
		return String.format("%s;%s;%d;%s;%.1f;%s\r\n",cpf, nome, idade, sexo, peso, obterDiagnostico());
	}

}