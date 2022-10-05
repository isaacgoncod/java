package objeto.aula03;

public class ContaCorrente {
	
	String numero;
	String agencia;
	double saldo;
	boolean statusEspecial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	boolean realizarSaque(double quantiaSacar) {
		//tem saldo na conta
		if(saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			
			return true;
		}else {//não tem saldo na conta
			if(statusEspecial) {
				//verificar se o limite tem saldo
				
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;//não é especial
			}
		}
	}
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	void consultarSaldo(){
		System.out.println("Saldo atual da conta = "+  saldo);
	}
	boolean verificarUsoLimiteEspecial() {
		return saldo < 0;
	}
}
