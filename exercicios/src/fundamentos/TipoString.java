package fundamentos;

public class TipoString {

		public static void main(String[] args) {
			
			System.out.println("Olá pessoal".charAt(2));
			
			String s = "Boa tarde";
			System.out.println(s.concat("!!!"));
			System.out.println(s + "!!!");
			System.out.println(s.startsWith("Boa"));
			System.out.println(s.toLowerCase().startsWith("TARDE"));
			System.out.println(s.lenght());
			System.out.println(s.toLowerCase().equals("boa tarde"));
			System.out.println(s.equalsIgnoreCase("boa tarde"));
			
		}
}
