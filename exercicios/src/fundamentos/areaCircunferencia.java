package fundamentos; 

public class areaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4, area;
		//final double (variavel constante)
		final double PI = 3.14159;
		
		area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Área = " + area + " m²");
		
	}

	
}
