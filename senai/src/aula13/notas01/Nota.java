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
	Nota(String setAluno, float setPortugues, float setMatematica, float setCiencias) {

		aluno = setAluno;
		portugues = setPortugues;
		matematica = setMatematica;
		ciencias = setCiencias;

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
