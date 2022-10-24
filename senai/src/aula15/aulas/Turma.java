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
		return 0;
	}
	
	public float faturamentoPorHora() {
		return 0;
	}
	
}
