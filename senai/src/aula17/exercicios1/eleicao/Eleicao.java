package aula17.exercicios1.eleicao;

public class Eleicao {

	private int numeroG;
	private int numeroP;

	public String governador() {
		if (numeroG == 10) {
			return "TARCISIO GOMES DE FREITAS";
		}
		if (numeroG == 13) {
			return "FERNANDO HADDAD";
		}
		if (numeroG == 00 || numeroG == 0) {
			return "GOVERNADOR : VOTO BRANCO";
		} else {
			return "GOVERNADOR : VOTO NULO";
		}
	}

	public String presidente() {
		if (numeroP == 13) {
			return "LUIZ INACIO LULA DA SILVA";
		}
		if (numeroP == 22) {
			return "JAIR MESSIAS BOLSONARO";
		}
		if (numeroP == 00 || numeroP == 0) {
			return "PRESIDENTE : VOTO BRANCO";
		} else {
			return "PRESIDENTE : VOTO NULO";
		}
	}

	public String getGovernador() {
		return governador();
	}

	public String getPresidente() {
		return presidente();
	}

	public int getNumeroG() {
		return numeroG;
	}

	public void setNumeroG(int numeroG) {
		this.numeroG = numeroG;
	}

	public int getNumeroP() {
		return numeroP;
	}

	public void setNumeroP(int numeroP) {
		this.numeroP = numeroP;
	}

	public String toCSV() {
		return String.format("%s;%d\r\n%s;%d\r\n", governador(), numeroG, presidente(), numeroP);
	}

}
