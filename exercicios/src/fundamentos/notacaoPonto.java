package fundamentos;

public class notacaoPonto {

	public static void main(String[] args) {
		
		
		String s = "Bom dia x";
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		//Notação Ponto
		String y = "Bom dia x".replace("x", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem esse operador "."
	}
}
