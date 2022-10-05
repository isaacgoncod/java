package objeto.aula03;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.statusEspecial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetudado com sucesso");
			conta.consultarSaldo();
			
		}else {
			System.out.println("Não foi possível realizar o saque");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque 500 conto");
		if(saqueEfetuado) {
			System.out.println("Saque efetudado com sucesso");
			conta.consultarSaldo();
			
		}else {
			System.out.println("Não foi possível realizar o saque");
		}
		
		System.out.println("Deposito de 500 conto");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoLimiteEspecial()) {
			System.out.println("Está usando o limite especial");
		}else {
			System.out.println("Não está usando o limite especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoLimiteEspecial()) {
			System.out.println("Está usando o limite especial");
		}else {
			System.out.println("Não está usando o limite especial");
		}
	}

}
