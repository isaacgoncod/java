package aula02.notas01.executavel;

import aula02.notas01.classes.Notas;

public class Main {
	public static void main(String[] args) {
		
		Notas[] notas = new Notas[4];
		
		notas[0] = new Notas();
		
		notas[0].aluno = "Jair";
		notas[0].portugues = 10.0f;
		notas[0].matematica = 5.0f;
		notas[0].ciencias = 10.0f;
		
		notas[1] = new Notas();
		
		notas[1].aluno = "José";
		notas[1].portugues = 8.0f;
		notas[1].matematica = 7.0f;
		notas[1].ciencias = 3.0f;
		
		notas[2] = new Notas();
		
		notas[2].aluno = "Humberto";
		notas[2].portugues = 6.0f;
		notas[2].matematica = 5.5f;
		notas[2].ciencias = 7.0f;
		
		notas[3] = new Notas();
		
		notas[3].aluno = "Zeroberto";
		notas[3].portugues = 8.8f;
		notas[3].matematica = 10.0f;
		notas[3].ciencias = 10.0f;
		
		System.out.println("Aluno\t\tPort.\tMat.\tCien.\tMedia");
		System.out.printf("%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t\n", notas[0].aluno, notas[0].portugues, notas[0].matematica, notas[0].ciencias, notas[0].getMedia());
		System.out.printf("%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t\n", notas[1].aluno, notas[1].portugues, notas[1].matematica, notas[1].ciencias, notas[1].getMedia());
		System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t\n", notas[2].aluno, notas[2].portugues, notas[2].matematica, notas[2].ciencias, notas[2].getMedia());
		System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t\n", notas[3].aluno, notas[3].portugues, notas[3].matematica, notas[3].ciencias, notas[3].getMedia());
	}
}
