package aula37;

public class Aluno extends Pessoa {

	private String curso;
	private double notas;

	public Aluno() {
		super();
		
	}

	public Aluno(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
	
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		super.setCpf("484.484.484-20");
	}
	public void verificarAcesso() {
		super.nomeVisibilidade = "fiu";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

}
