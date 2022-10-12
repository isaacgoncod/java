package objeto.aula06;

public class Contador {
	
	private static int cont;
	
	public static void getIncrementar() {
		cont++;
	}
	public static void getZerar() {
		cont = 0;
	}
	public static int getObterValor() {
		return cont;
	}
}
