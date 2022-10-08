package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class TesteAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 0; qtd < 2; qtd++) {

			// new Aluno() é uma instância (criação de objeto)
			// aluno1 é uma referência(variável) para o objeto Aluno
			Aluno aluno1 = new Aluno();

			// Entrada de dados
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno ?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno ?"); String
			 * rg = JOptionPane.showInputDialog("Qual o número de RG do aluno ?"); String
			 * cpf = JOptionPane.showInputDialog("Qual o número de CPF do aluno ?"); String
			 * mae = JOptionPane.showInputDialog("Qual o nome da mãe ?"); String pai =
			 * JOptionPane.showInputDialog("Qual o nome do pai ?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Data da Matricula: "); String serie =
			 * JOptionPane.showInputDialog("Série do aluno: "); String escola =
			 * JOptionPane.showInputDialog("Nome da escola: ");
			 */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));//casting inteiro
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(dataMatricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int i = 0; i < 4; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da " + (i + 1) + "º disciplina ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da " + (i + 1) + "º disciplina ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplina().add(disciplina);
			}
			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {

			System.out.println(aluno.toString());// Descrição do objeto na memória
			System.out.println("Media da nota é = " + aluno.getMediaNota());
			System.out.println("Resultado 1 = " + (aluno.getAlunoAprovado() ? "APROVADO" : "REPROVADO"));
			System.out.println("Resultado 2 = " + aluno.getAlunoAprovado2());
			System.out.println();
		}
		// Equal e Hashcode (diferenciar e comparar objetos)
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Isaac");

		Aluno aluno4 = new Aluno();
		aluno4.setNome("Isaac");

		if (aluno3.equals(aluno4)) {
			System.out.println("Os alunos tem o mesmo nome");
		} else {
			System.out.println("Os alunos tem os nomes diferentes");
		}
	}

}
