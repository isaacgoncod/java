package aula02.notas01.classes;

public class Notas {
	
	public String aluno;
	public float portugues;
	public float matematica;
	public float ciencias;
	
	public float getMedia() {
		
		return (portugues + matematica + ciencias) / 3;
	}
	
}
