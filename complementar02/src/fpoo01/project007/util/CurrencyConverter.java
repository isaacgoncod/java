package fpoo01.project007.util;

public class CurrencyConverter {
	
	
	public static double calculate(double cotacao, double dinheiro) {
		
		double iof;
		
		iof = 6 * dinheiro / 100;
		
		return cotacao * (dinheiro + iof);
	}
	
	

}
