package aula13.notas01;

public class Nota {

	String aluno;
	float portugues;
	float matematica;
	float ciencias;

	// Constructor vazio
	Nota() {
	}

	// Contructor cheio
	public Nota(String aluno, float portugues, float matematica, float ciencias) {
		super();
		this.aluno = aluno;
		this.portugues = portugues;
		this.matematica = matematica;
		this.ciencias = ciencias;
	}

	public float getMediaConceitual() {
		return (portugues + matematica + ciencias) / 3;

	}

	public String getConceito() {

		if (getMediaConceitual() > 5) {
			return "APROVADO";
		} else {
			return "REPROVADO";
		}

	}

	public String toString() {
		return String.format("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t\n", aluno, portugues, matematica, ciencias,
				getMediaConceitual(), getConceito());
	}

}
