package basico.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: "	+	resultado1); 
		
		boolean	resultado2	=	(valor1	==	1)	||	(valor2	==	2);
		System.out.println("Valor1 é 1 OR valor2 é 2 - resultado: "	+	resultado2);
					
		boolean	verdadeiro	=	true;
		boolean	falso	=	false;
		boolean	resultado3	=	falso	&	verdadeiro;
		boolean	resultado4	=	falso	&&	verdadeiro;
		
		System.out.println(resultado3);
		System.out.println(resultado4);
		
		int resultado	=	1	+	1	-	1	+	1	*	1	/	1;
		System.out.println(resultado);
	}

}
