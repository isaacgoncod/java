package fundamentos;

public class tiposPrimitivos {
	
	public static void main(String[] args) {
		//informações do funcionário
		
		// tipos númericos
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //literal long
		
		// Tipos númericos reais
		float salario = 11_445.44F; //literal float
		double vendasAcumuladas = 2_991_797_183.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; // Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens 
		System.out.println(numerosDeVoo / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> "+ salario);
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status : " + status);
		
	}
}
