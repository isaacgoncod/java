package aula13.notas02;

public class Nota {

	private String aluno;
	private double portugues;
	private double matematica;
	private double ciencias;

	public double getMediaNota() {
		return (portugues + matematica + ciencias) / 3;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public double getPortugues() {
		return portugues;
	}

	public void setPortugues(double portugues) {
		this.portugues = portugues;
	}

	public double getMatematica() {
		return matematica;
	}

	public void setMatematica(double matematica) {
		this.matematica = matematica;
	}

	public double getCiencias() {
		return ciencias;
	}

	public void setCiencias(double ciencias) {
		this.ciencias = ciencias;
	}

	@Override
	public String toString() {
		return "Notas [aluno=" + aluno + ", portugues=" + portugues + ", matematica=" + matematica + ", ciencias="
				+ ciencias + "]";
	}

}
