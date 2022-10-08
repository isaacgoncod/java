package aula02.notas02.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula02.notas02.classes.Notas;

public class Main {

	public static void main(String[] args) {

		List<Notas> nota = new ArrayList<Notas>();

		for (int i = 0; i < 2; i++) {
			Notas aluno1 = new Notas();

			String nome = JOptionPane.showInputDialog("Qual o nome do " + (i + 1) + "º aluno?");
			String notaPortugues = JOptionPane.showInputDialog("Qual a nota de Português do " + (i + 1) + "º aluno?");
			String notaMatematica = JOptionPane.showInputDialog("Qual a nota de Matemática do " + (i + 1) + "º aluno?");
			String notaCiencias = JOptionPane.showInputDialog("Qual a nota de Ciências do " + (i + 1) + "º aluno?");

			aluno1.setAluno(nome);
			aluno1.setPortugues(Double.valueOf(notaPortugues));
			aluno1.setMatematica(Double.valueOf(notaMatematica));
			aluno1.setCiencias(Double.valueOf(notaCiencias));

			nota.add(aluno1);
		}
		for(Notas aluno : nota) {
			System.out.println(aluno.toString());
			System.out.println("Media da nota é = " + aluno.getMediaNota());
		}
	}

}
