package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		
		double fare = 150 , cel;
		// colocando .0 o java intende o número como real
		final double i = 32, n = 5.0 / 9.0;
		
		
		cel = (fare - i) * n;
		
		System.out.println("O resultado é " + cel + " °C.");
		
	}
}
