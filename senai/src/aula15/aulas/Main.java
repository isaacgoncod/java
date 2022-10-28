package aula15.aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int qtd;
		double faturamentoTotal = 0;

		ArrayList<Turma> turmas = new ArrayList<Turma>();

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de turmas para o cadastro: ");
			qtd = scan.nextInt();

			System.out.println(
					"Digíte o nome da turma, periodo, dia da semana, quantidade de alunos, horas semanais das aulas e a mensalidade das turmas: ");
			for (int i = 0; i < qtd; i++) {
				turmas.add(new Turma(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(),
						scan.nextFloat()));
			}
		}

		for (int i = 0; i < turmas.size(); i++) {
			faturamentoTotal += turmas.get(i).faturamentoMensal();
		}

		System.out.println(
				"nomeTurma\t\tperiodo\t\tdiaSemana\tnumAlunos\thorasSemanais\tmensalidade\tfaturamentoMensal\tfaturamentoHora");
//		for (int i = 0; i < turmas.size(); i++) {
//			System.out.printf("%s\t\t%s\t\t%s\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t\t%.2f\n", turmas.get(i).nomeTurma,
//					turmas.get(i).periodo, turmas.get(i).diaDaSemana, turmas.get(i).numAlunos,
//					turmas.get(i).horasSemanais, turmas.get(i).mensalidade, turmas.get(i).faturamentoMensal(),
//					turmas.get(i).faturamentoPorHora());
//		}
		for (Turma turma : turmas) {
			System.out.printf(turma.toString());
		}
		System.out.println();
		System.out.printf("O faturamento total e de: R$ %.2f", faturamentoTotal);

	}
}
