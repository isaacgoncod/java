package fundamentos;

public class inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);		
		/*
			o java consegue inferir o tipo ,ou seja, descobri qual tipo primitivo da variavel sem declara - la.
			Porem a variavel que vale o tipo é sempre a primeira variavel.
		 */
		var b = 4.5;
		System.out.println(b);
		
		// o var precisa ser declarado na mesma linha
		var c = "Texto";
		System.out.println(c);
		
		double d; // váriavel foi declarada
		d = 123; // váriavel foi inicializada
		System.out.println(d); //usada :
				
		
		
	}
	
}
