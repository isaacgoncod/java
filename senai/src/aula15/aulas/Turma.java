package aula15.aulas;

public class Turma {

	String nomeTurma;
	String periodo;
	String diaDaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;

	public Turma(String nomeTurma, String periodo, String diaDaSemana, int numAlunos, int horasSemanais,
			float mensalidade) {
		super();
		this.nomeTurma = nomeTurma;
		this.periodo = periodo;
		this.diaDaSemana = diaDaSemana;
		this.numAlunos = numAlunos;
		this.horasSemanais = horasSemanais;
		this.mensalidade = mensalidade;
	}

	public float faturamentoMensal() {
		return mensalidade * numAlunos;
	}

	public double faturamentoPorHora() {
		return (faturamentoMensal() / (horasSemanais * 4.5));
	}

}
