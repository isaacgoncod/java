package objeto.aula01;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 12;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		

	}

}
