package objeto.aula03;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		System.out.println("A lampada está " + lampada.lampadaLigada());
		System.out.println("A lampada está " + lampada.lampadaDesligada());
	}

}
