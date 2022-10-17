package objeto.aula05;

public class MinhaCalculadora {

	public static int getSomar(int num1, int num2) {
		return num1 + num2;

	}

	public static double getSubtrair(double num1, double num2) {
		return num1 - num2;

	}

	public static int getMultiplicar(int num1, int num2) {
		return num1 * num2;

	}

	public static double getPotencia(double num1, double num2) {
		double total = 1;
		
		for( int i = 0; i < num2; i++) {
			total*= num1;
		}
		return total;
				
	}
	public static int getFatorialNaoRecursivo(int num) {
		
		int total = 1;
		
		if(num == 0) {
			return 1;
		}
		
		for(int i = num; i>0; i++) {
			total *=  num;
		}
		
		return total;
		
	}
	public static int getFatorialRecursivo(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * getFatorialRecursivo(num - 1);
	}
}