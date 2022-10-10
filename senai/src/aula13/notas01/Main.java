package aula13.notas01;

public class Main {
	public static void main(String[] args) {

		Nota[] notas = new Nota[4];

		notas[0] = new Nota("Jair", 1.0f, 1.0f, 5.0f);
		notas[1] = new Nota("José", 8.0f, 7.0f, 3.0f);
		notas[2] = new Nota("Humb.", 4.0f, 4.5f, 5.0f);
		notas[3] = new Nota("Zero.", 8.8f, 10.0f, 10.0f);

		System.out.println("Aluno\tPort.\tMat.\tCien.\tM.C.\tSituacao");
		for (int i = 0; i < 4; i++) {

			System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t\n", notas[i].aluno, notas[i].portugues,
					notas[i].matematica, notas[i].ciencias, notas[i].getMediaConceitual(), notas[i].getConceito());
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.println(notas[i].toString());
		}

	}
}
