package aula37;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double salario;
	

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
		// TODO Auto-generated constructor stub
	}
	public void verificarAcesso() {
		super.nomeVisibilidade = "f";
	}

	public double calcularSalarioLiquido() {
		return 0;
		
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
